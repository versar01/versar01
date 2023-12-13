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
 * Each entry defines a calculation of discount giving the method of calculation, the charges that it discounts and the method of posting to ledgers.
 * <p>
 *   
 
 These individual calculation definitions are grouped together under dip_discount_plan and it is these groupings
 *   that are offered to the subscriber. The individual rules are not offered in their own right.
 * </p>
 *
 * This abstract business logic class holds all the logic for the DirDiscountRule class.
 * It is extended by DirDiscountRule class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DirDiscountRuleAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DirDiscountRule.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DIRR";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DirDiscountRuleDAC dirDiscountRuleDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DirDiscountRuleDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dirDiscountRuleDAC = (DirDiscountRuleDAC) dac;
  }

  /**
  * Retrieve a dirDiscountRule data model object from persistent storage. The
  * dirDiscountRuleDMO passed in must contain a valid existing dirDiscountRuleId.
  * Optionally, the return dirDiscountRuleDMO may be include a flag that indicates if
  * the dirDiscountRule object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dirDiscountRule object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIRDISCOUNTRULE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dirDiscountRuleDMO the dirDiscountRule object that must contain either the
  *         unique dirDiscountRuleId or the displayCode/languageCode pair
  *
  * @return dirDiscountRuleDMO the dirDiscountRule data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DirDiscountRuleDMO get( DirDiscountRuleDMO dirDiscountRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dirDiscountRuleDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dirDiscountRuleDMO", dirDiscountRuleDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleId",
      dirDiscountRuleDMO.getDirRuleId(  ) );

    //
    // Attempt to get the DirDiscountRuleDMO
    //
    DirDiscountRuleDMO returnDirDiscountRuleDMO = dirDiscountRuleDAC.get( dirDiscountRuleDMO );

    //
    // Could not find the DirDiscountRuleDMO
    //
    if ( returnDirDiscountRuleDMO == null ) {
      thrower.business( Base_DIRDISCOUNTRULE_000,
        new Object[] { dirDiscountRuleDMO.getDirRuleId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDirDiscountRuleDMO;
  }

  /**
   * Return a list of DirDiscountRule objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dirDiscountRules
   * displayCode. If no values have been passed in, all DirDiscountRule objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DirDiscountRule is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dirDiscountRuleDMO DirDiscountRuleDMO object
   *
   * @return DTOList of DirDiscountRule objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    DirDiscountRuleDMO dirDiscountRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dirDiscountRuleDMO )" );

    return dirDiscountRuleDAC.getList( state, dirDiscountRuleDMO );
  }

  /**
  * Creates the DirDiscountRule object. As a side effect, following creation
  * of a dirDiscountRule an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dirDiscountRuleDMO dirDiscountRuleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dirDiscountRuleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DirDiscountRuleDMO create( DirDiscountRuleDMO dirDiscountRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dirDiscountRuleDMO )" );

    thrower.ifParameterMissing( "dirDiscountRuleDMO", dirDiscountRuleDMO );

    // Set generated key to 0
    dirDiscountRuleDMO.setDirRuleId(new Integer(0));

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleRef",
      dirDiscountRuleDMO.getDirRuleRef(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirStartDate",
      dirDiscountRuleDMO.getDirStartDate(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirEndDate",
      dirDiscountRuleDMO.getDirEndDate(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleDesc",
      dirDiscountRuleDMO.getDirRuleDesc(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleType",
      dirDiscountRuleDMO.getDirRuleType(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirStartAfter",
      dirDiscountRuleDMO.getDirStartAfter(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirApplyFor",
      dirDiscountRuleDMO.getDirApplyFor(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirBandType",
      dirDiscountRuleDMO.getDirBandType(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirThresholdId",
      dirDiscountRuleDMO.getDirThresholdId(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirAppDiscId",
      dirDiscountRuleDMO.getDirAppDiscId(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleUsed",
      dirDiscountRuleDMO.getDirRuleUsed(  ) );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirAppToVal",
      dirDiscountRuleDMO.getDirAppToVal(  ) );

    //
    // Now create the dirDiscountRule
    //
    dirDiscountRuleDMO = dirDiscountRuleDAC.create( dirDiscountRuleDMO );

    return dirDiscountRuleDMO;
  }

  /**
  * Modifies the DirDiscountRule object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIRDISCOUNTRULE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dirDiscountRuleDMO dirDiscountRuleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dirDiscountRuleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
//  public DirDiscountRuleDMO modify( DirDiscountRuleDMO aDirDiscountRuleDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "modify( adirDiscountRuleDMO )" );
//
//    //
//    // Check mandatory parameters (
//    //
//    // Note: attributes stereotyped <NotModifiable> are ignored
//    //
//    thrower.ifParameterMissing( "adirDiscountRuleDMO", aDirDiscountRuleDMO );
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirRuleId",
//      aDirDiscountRuleDMO.getDirRuleId(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirRuleRef",
//      aDirDiscountRuleDMO.getDirRuleRef(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirStartDate",
//      aDirDiscountRuleDMO.getDirStartDate(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirEndDate",
//      aDirDiscountRuleDMO.getDirEndDate(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirRuleDesc",
//      aDirDiscountRuleDMO.getDirRuleDesc(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirRuleType",
//      aDirDiscountRuleDMO.getDirRuleType(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirStartAfter",
//      aDirDiscountRuleDMO.getDirStartAfter(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirApplyFor",
//      aDirDiscountRuleDMO.getDirApplyFor(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirBandType",
//      aDirDiscountRuleDMO.getDirBandType(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirThresholdId",
//      aDirDiscountRuleDMO.getDirThresholdId(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirAppDiscId",
//      aDirDiscountRuleDMO.getDirAppDiscId(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirRuleUsed",
//      aDirDiscountRuleDMO.getDirRuleUsed(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aDirDiscountRuleDMO.dirAppToVal",
//      aDirDiscountRuleDMO.getDirAppToVal(  ) ); // attribute
//
//    DirDiscountRuleDMO updateDirDiscountRuleDMO = new DirDiscountRuleDMO(  );
//
//    updateDirDiscountRuleDMO.setDirRuleId( aDirDiscountRuleDMO.getDirRuleId(  ) );
//
//    updateDirDiscountRuleDMO = get( updateDirDiscountRuleDMO );
//
//    //
//    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
//    // either associate to a pre-existing object, or create an object then associate to it
//    //
//
//    //
//    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
//    // All attributes stereotyped as being <NotModifiable> are skipped
//    //
//    updateDirDiscountRuleDMO.setDirRuleRef( aDirDiscountRuleDMO.getDirRuleRef(  ) );
//
//    updateDirDiscountRuleDMO.setDirStartDate( aDirDiscountRuleDMO
//      .getDirStartDate(  ) );
//
//    updateDirDiscountRuleDMO.setDirEndDate( aDirDiscountRuleDMO.getDirEndDate(  ) );
//
//    updateDirDiscountRuleDMO.setDirRuleDesc( aDirDiscountRuleDMO
//      .getDirRuleDesc(  ) );
//
//    updateDirDiscountRuleDMO.setDirRuleType( aDirDiscountRuleDMO
//      .getDirRuleType(  ) );
//
//    updateDirDiscountRuleDMO.setDirStartAfter( aDirDiscountRuleDMO
//      .getDirStartAfter(  ) );
//
//    updateDirDiscountRuleDMO.setDirApplyFor( aDirDiscountRuleDMO
//      .getDirApplyFor(  ) );
//
//    updateDirDiscountRuleDMO.setDirBandType( aDirDiscountRuleDMO
//      .getDirBandType(  ) );
//
//    updateDirDiscountRuleDMO.setDirThresholdId( aDirDiscountRuleDMO
//      .getDirThresholdId(  ) );
//
//    updateDirDiscountRuleDMO.setDirAppDiscId( aDirDiscountRuleDMO
//      .getDirAppDiscId(  ) );
//
//    updateDirDiscountRuleDMO.setDirChargeRef( aDirDiscountRuleDMO
//      .getDirChargeRef(  ) );
//
//    updateDirDiscountRuleDMO.setDirRuleUsed( aDirDiscountRuleDMO
//      .getDirRuleUsed(  ) );
//
//    updateDirDiscountRuleDMO.setDirAppToVal( aDirDiscountRuleDMO
//      .getDirAppToVal(  ) );
//
//    //
//    // Modify the dirDiscountRuleDMO
//    //
//    dirDiscountRuleDAC.modify( updateDirDiscountRuleDMO );
//
//    // Create a new DMO, set keys, and fetch from the database...
//    DirDiscountRuleDMO returnDirDiscountRuleDMO = new DirDiscountRuleDMO(  );
//
//    returnDirDiscountRuleDMO.setDirRuleId( updateDirDiscountRuleDMO
//      .getDirRuleId(  ) );
//
//    returnDirDiscountRuleDMO = get( returnDirDiscountRuleDMO );
//
//    return returnDirDiscountRuleDMO;
//  }

  /**
  * Modifies the DirDiscountRule object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DirDiscountRuleDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dirDiscountRuleDMO object.
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
    // Modify the dirDiscountRuleDMO
    //
    dirDiscountRuleDAC.modify( filter );
  }

  /**
   * Deletes the DirDiscountRule object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DIRDISCOUNTRULE_003
   *     <li>{@link #Base#DIRDISCOUNTRULE_000} if the DirDiscountRule does not exist.</li>
   *     <li>{@link #Base#DIRDISCOUNTRULE_003} if the DirDiscountRule is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DirDiscountRuleDMO DirDiscountRule object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DirDiscountRuleDMO dirDiscountRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dirDiscountRuleDMO )" );

    thrower.ifParameterMissing( "dirDiscountRuleDMO", dirDiscountRuleDMO );

    DirDiscountRuleDMO updateDirDiscountRuleDMO = null;

    updateDirDiscountRuleDMO = get( dirDiscountRuleDMO );

    // delete self...
    dirDiscountRuleDAC.delete( dirDiscountRuleDMO );
  }

  /**
   * Deletes the DirDiscountRule object.
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
    dirDiscountRuleDAC.delete( filter );
  }

  /**
  * Indicates whether a DirDiscountRule exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DirDiscountRule exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DirDiscountRuleDMO dirDiscountRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dirDiscountRule)" );

    thrower.ifParameterMissing( "dirDiscountRuleDMO", dirDiscountRuleDMO );

    thrower.ifParameterMissing( "dirDiscountRuleDMO.dirRuleId",
      dirDiscountRuleDMO.getDirRuleId(  ) );

    return dirDiscountRuleDAC.exists( dirDiscountRuleDMO );
  }

  /**
   * Indicates whether a DirDiscountRule exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DirDiscountRule exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dirDiscountRuleDAC.exists( filter );
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

    return dirDiscountRuleDAC.getList( state, filter );
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

    return dirDiscountRuleDAC.iterate( filter );
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

    return dirDiscountRuleDAC.iterateWithLock( filter );
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
  public DirDiscountRuleDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DirDiscountRuleDMO
    //
    DirDiscountRuleDMO dirDiscountRuleDMO = dirDiscountRuleDAC.get( filter );

    return dirDiscountRuleDMO;
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

    return dirDiscountRuleDAC.max( filter );
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

    return dirDiscountRuleDAC.min( filter );
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

    return new Integer(dirDiscountRuleDAC.count( filter ));
  }
}
