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
 * Defines the individual rules, which make up a discount plan.
 * <p>
 *   Each rule is defined within DIR_DISCOUNT_RULE table.
 * </p>
 *
 * This abstract business logic class holds all the logic for the DipDiscountPlan class.
 * It is extended by DipDiscountPlan class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DipDiscountPlanAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DipDiscountPlan.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DIPP";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DipDiscountPlanDAC dipDiscountPlanDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DipDiscountPlanDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dipDiscountPlanDAC = (DipDiscountPlanDAC) dac;
  }

  /**
  * Retrieve a dipDiscountPlan data model object from persistent storage. The
  * dipDiscountPlanDMO passed in must contain a valid existing dipDiscountPlanId.
  * Optionally, the return dipDiscountPlanDMO may be include a flag that indicates if
  * the dipDiscountPlan object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dipDiscountPlan object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIPDISCOUNTPLAN_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dipDiscountPlanDMO the dipDiscountPlan object that must contain either the
  *         unique dipDiscountPlanId or the displayCode/languageCode pair
  *
  * @return dipDiscountPlanDMO the dipDiscountPlan data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DipDiscountPlanDMO get( DipDiscountPlanDMO dipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dipDiscountPlanDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dipDiscountPlanDMO", dipDiscountPlanDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipDiscountId",
      dipDiscountPlanDMO.getDipDiscountId(  ) );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipSequence",
      dipDiscountPlanDMO.getDipSequence(  ) );

    //
    // Attempt to get the DipDiscountPlanDMO
    //
    DipDiscountPlanDMO returnDipDiscountPlanDMO = dipDiscountPlanDAC.get( dipDiscountPlanDMO );

    //
    // Could not find the DipDiscountPlanDMO
    //
    if ( returnDipDiscountPlanDMO == null ) {
      thrower.business( Base_DIPDISCOUNTPLAN_000,
        new Object[] {
          dipDiscountPlanDMO.getDipDiscountId(  ),
          dipDiscountPlanDMO.getDipSequence(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDipDiscountPlanDMO;
  }

  /**
   * Return a list of DipDiscountPlan objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dipDiscountPlans
   * displayCode. If no values have been passed in, all DipDiscountPlan objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DipDiscountPlan is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dipDiscountPlanDMO DipDiscountPlanDMO object
   *
   * @return DTOList of DipDiscountPlan objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    DipDiscountPlanDMO dipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dipDiscountPlanDMO )" );

    return dipDiscountPlanDAC.getList( state, dipDiscountPlanDMO );
  }

  /**
  * Creates the DipDiscountPlan object. As a side effect, following creation
  * of a dipDiscountPlan an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dipDiscountPlanDMO dipDiscountPlanDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dipDiscountPlanDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DipDiscountPlanDMO create( DipDiscountPlanDMO dipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dipDiscountPlanDMO )" );

    thrower.ifParameterMissing( "dipDiscountPlanDMO", dipDiscountPlanDMO );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipDiscountId",
      dipDiscountPlanDMO.getDipDiscountId(  ) );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipSequence",
      dipDiscountPlanDMO.getDipSequence(  ) );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipRuleRef",
      dipDiscountPlanDMO.getDipRuleRef(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( dipDiscountPlanDMO ) ) {
      thrower.business( Base_DIPDISCOUNTPLAN_001,
        new Object[] {
          dipDiscountPlanDMO.getDipDiscountId(  ),
          dipDiscountPlanDMO.getDipSequence(  )
        } );
    }

    //
    // Now create the dipDiscountPlan
    //
    dipDiscountPlanDAC.create( dipDiscountPlanDMO );

    return dipDiscountPlanDMO;
  }

  /**
  * Modifies the DipDiscountPlan object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIPDISCOUNTPLAN_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dipDiscountPlanDMO dipDiscountPlanDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dipDiscountPlanDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DipDiscountPlanDMO modify( DipDiscountPlanDMO aDipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adipDiscountPlanDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adipDiscountPlanDMO", aDipDiscountPlanDMO );

    thrower.ifParameterMissing( "aDipDiscountPlanDMO.dipDiscountId",
      aDipDiscountPlanDMO.getDipDiscountId(  ) ); // attribute

    thrower.ifParameterMissing( "aDipDiscountPlanDMO.dipSequence",
      aDipDiscountPlanDMO.getDipSequence(  ) ); // attribute

    thrower.ifParameterMissing( "aDipDiscountPlanDMO.dipRuleRef",
      aDipDiscountPlanDMO.getDipRuleRef(  ) ); // attribute

    DipDiscountPlanDMO updateDipDiscountPlanDMO = new DipDiscountPlanDMO(  );

    updateDipDiscountPlanDMO.setDipDiscountId( aDipDiscountPlanDMO
      .getDipDiscountId(  ) );

    updateDipDiscountPlanDMO.setDipSequence( aDipDiscountPlanDMO
      .getDipSequence(  ) );

    updateDipDiscountPlanDMO = get( updateDipDiscountPlanDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDipDiscountPlanDMO.setDipRuleRef( aDipDiscountPlanDMO.getDipRuleRef(  ) );

    //
    // Modify the dipDiscountPlanDMO
    //
    dipDiscountPlanDAC.modify( updateDipDiscountPlanDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DipDiscountPlanDMO returnDipDiscountPlanDMO = new DipDiscountPlanDMO(  );

    returnDipDiscountPlanDMO.setDipDiscountId( updateDipDiscountPlanDMO
      .getDipDiscountId(  ) );

    returnDipDiscountPlanDMO.setDipSequence( updateDipDiscountPlanDMO
      .getDipSequence(  ) );

    returnDipDiscountPlanDMO = get( returnDipDiscountPlanDMO );

    return returnDipDiscountPlanDMO;
  }

  /**
  * Modifies the DipDiscountPlan object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DipDiscountPlanDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dipDiscountPlanDMO object.
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
    // Modify the dipDiscountPlanDMO
    //
    dipDiscountPlanDAC.modify( filter );
  }

  /**
   * Deletes the DipDiscountPlan object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DIPDISCOUNTPLAN_003
   *     <li>{@link #Base#DIPDISCOUNTPLAN_000} if the DipDiscountPlan does not exist.</li>
   *     <li>{@link #Base#DIPDISCOUNTPLAN_003} if the DipDiscountPlan is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DipDiscountPlanDMO DipDiscountPlan object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DipDiscountPlanDMO dipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dipDiscountPlanDMO )" );

    thrower.ifParameterMissing( "dipDiscountPlanDMO", dipDiscountPlanDMO );

    DipDiscountPlanDMO updateDipDiscountPlanDMO = null;

    updateDipDiscountPlanDMO = get( dipDiscountPlanDMO );

    // delete self...
    dipDiscountPlanDAC.delete( dipDiscountPlanDMO );
  }

  /**
   * Deletes the DipDiscountPlan object.
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
    dipDiscountPlanDAC.delete( filter );
  }

  /**
  * Indicates whether a DipDiscountPlan exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DipDiscountPlan exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DipDiscountPlanDMO dipDiscountPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dipDiscountPlan)" );

    thrower.ifParameterMissing( "dipDiscountPlanDMO", dipDiscountPlanDMO );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipDiscountId",
      dipDiscountPlanDMO.getDipDiscountId(  ) );

    thrower.ifParameterMissing( "dipDiscountPlanDMO.dipSequence",
      dipDiscountPlanDMO.getDipSequence(  ) );

    return dipDiscountPlanDAC.exists( dipDiscountPlanDMO );
  }

  /**
   * Indicates whether a DipDiscountPlan exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DipDiscountPlan exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dipDiscountPlanDAC.exists( filter );
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

    return dipDiscountPlanDAC.getList( state, filter );
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

    return dipDiscountPlanDAC.iterate( filter );
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

    return dipDiscountPlanDAC.iterateWithLock( filter );
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
  public DipDiscountPlanDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DipDiscountPlanDMO
    //
    DipDiscountPlanDMO dipDiscountPlanDMO = dipDiscountPlanDAC.get( filter );

    return dipDiscountPlanDMO;
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

    return dipDiscountPlanDAC.max( filter );
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

    return dipDiscountPlanDAC.min( filter );
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

    return new Integer(dipDiscountPlanDAC.count( filter ));
  }
}
