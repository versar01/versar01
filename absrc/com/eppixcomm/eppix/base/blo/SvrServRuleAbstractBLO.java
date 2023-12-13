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
 * Holds mutually inclusive & exclusive rules for each defined service.
 * <p>
 *   Eg If a basic service is activated, an international bar may need to be applied automatically. By the same token if an
 *   international bar is applied, an international dial service would not be made available to the subscriber.
 * </p>
 *
 * This abstract business logic class holds all the logic for the SvrServRule class.
 * It is extended by SvrServRule class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SvrServRuleAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SvrServRule.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SVRR";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SvrServRuleDAC svrServRuleDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return SvrServRuleDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.svrServRuleDAC = (SvrServRuleDAC) dac;
  }

  /**
  * Retrieve a svrServRule data model object from persistent storage. The
  * svrServRuleDMO passed in must contain a valid existing svrServRuleId.
  * Optionally, the return svrServRuleDMO may be include a flag that indicates if
  * the svrServRule object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the svrServRule object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SVRSERVRULE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  svrServRuleDMO the svrServRule object that must contain either the
  *         unique svrServRuleId or the displayCode/languageCode pair
  *
  * @return svrServRuleDMO the svrServRule data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SvrServRuleDMO get( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(svrServRuleDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "svrServRuleDMO", svrServRuleDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "svrServRuleDMO.svrPrimaryServ",
      svrServRuleDMO.getSvrPrimaryServ(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrServType",
      svrServRuleDMO.getSvrServType(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrTargetServ",
      svrServRuleDMO.getSvrTargetServ(  ) );

    //
    // Attempt to get the SvrServRuleDMO
    //
    SvrServRuleDMO returnSvrServRuleDMO = svrServRuleDAC.get( svrServRuleDMO );

    //
    // Could not find the SvrServRuleDMO
    //
    if ( returnSvrServRuleDMO == null ) {
      thrower.business( Base_SVRSERVRULE_000,
        new Object[] {
          svrServRuleDMO.getSvrPrimaryServ(  ),
          svrServRuleDMO.getSvrServType(  ),
          svrServRuleDMO.getSvrTargetServ(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSvrServRuleDMO;
  }

  /**
   * Return a list of SvrServRule objects matching the passed in values. A
   * partial match is performed on the description argument and/or the svrServRules
   * displayCode. If no values have been passed in, all SvrServRule objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SvrServRule is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param svrServRuleDMO SvrServRuleDMO object
   *
   * @return DTOList of SvrServRule objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState   state,
    SvrServRuleDMO svrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, svrServRuleDMO )" );

    return svrServRuleDAC.getList( state, svrServRuleDMO );
  }

  /**
  * Creates the SvrServRule object. As a side effect, following creation
  * of a svrServRule an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param svrServRuleDMO svrServRuleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated svrServRuleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SvrServRuleDMO create( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( svrServRuleDMO )" );

    thrower.ifParameterMissing( "svrServRuleDMO", svrServRuleDMO );

    thrower.ifParameterMissing( "svrServRuleDMO.svrPrimaryServ",
      svrServRuleDMO.getSvrPrimaryServ(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrServType",
      svrServRuleDMO.getSvrServType(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrTargetServ",
      svrServRuleDMO.getSvrTargetServ(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( svrServRuleDMO ) ) {
      thrower.business( Base_SVRSERVRULE_001,
        new Object[] {
          svrServRuleDMO.getSvrPrimaryServ(  ),
          svrServRuleDMO.getSvrServType(  ),
          svrServRuleDMO.getSvrTargetServ(  )
        } );
    }

    //
    // Now create the svrServRule
    //
    svrServRuleDAC.create( svrServRuleDMO );

    return svrServRuleDMO;
  }

  /**
  * Modifies the SvrServRule object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SVRSERVRULE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param svrServRuleDMO svrServRuleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated svrServRuleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SvrServRuleDMO modify( SvrServRuleDMO aSvrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( asvrServRuleDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "asvrServRuleDMO", aSvrServRuleDMO );

    thrower.ifParameterMissing( "aSvrServRuleDMO.svrPrimaryServ",
      aSvrServRuleDMO.getSvrPrimaryServ(  ) ); // attribute

    thrower.ifParameterMissing( "aSvrServRuleDMO.svrServType",
      aSvrServRuleDMO.getSvrServType(  ) ); // attribute

    thrower.ifParameterMissing( "aSvrServRuleDMO.svrTargetServ",
      aSvrServRuleDMO.getSvrTargetServ(  ) ); // attribute

    SvrServRuleDMO updateSvrServRuleDMO = new SvrServRuleDMO(  );

    updateSvrServRuleDMO.setSvrPrimaryServ( aSvrServRuleDMO.getSvrPrimaryServ(  ) );

    updateSvrServRuleDMO.setSvrServType( aSvrServRuleDMO.getSvrServType(  ) );

    updateSvrServRuleDMO.setSvrTargetServ( aSvrServRuleDMO.getSvrTargetServ(  ) );

    updateSvrServRuleDMO = get( updateSvrServRuleDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSvrServRuleDMO.setSvrServHierarchy( aSvrServRuleDMO
      .getSvrServHierarchy(  ) );

    //
    // Modify the svrServRuleDMO
    //
    svrServRuleDAC.modify( updateSvrServRuleDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SvrServRuleDMO returnSvrServRuleDMO = new SvrServRuleDMO(  );

    returnSvrServRuleDMO.setSvrPrimaryServ( updateSvrServRuleDMO
      .getSvrPrimaryServ(  ) );

    returnSvrServRuleDMO.setSvrServType( updateSvrServRuleDMO.getSvrServType(  ) );

    returnSvrServRuleDMO.setSvrTargetServ( updateSvrServRuleDMO
      .getSvrTargetServ(  ) );

    returnSvrServRuleDMO = get( returnSvrServRuleDMO );

    return returnSvrServRuleDMO;
  }

  /**
  * Modifies the SvrServRule object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SvrServRuleDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated svrServRuleDMO object.
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
    // Modify the svrServRuleDMO
    //
    svrServRuleDAC.modify( filter );
  }

  /**
   * Deletes the SvrServRule object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SVRSERVRULE_003
   *     <li>{@link #Base#SVRSERVRULE_000} if the SvrServRule does not exist.</li>
   *     <li>{@link #Base#SVRSERVRULE_003} if the SvrServRule is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SvrServRuleDMO SvrServRule object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( svrServRuleDMO )" );

    thrower.ifParameterMissing( "svrServRuleDMO", svrServRuleDMO );

    SvrServRuleDMO updateSvrServRuleDMO = null;

    updateSvrServRuleDMO = get( svrServRuleDMO );

    // delete self...
    svrServRuleDAC.delete( svrServRuleDMO );
  }

  /**
   * Deletes the SvrServRule object.
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
    svrServRuleDAC.delete( filter );
  }

  /**
  * Indicates whether a SvrServRule exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the SvrServRule exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(svrServRule)" );

    thrower.ifParameterMissing( "svrServRuleDMO", svrServRuleDMO );

    thrower.ifParameterMissing( "svrServRuleDMO.svrPrimaryServ",
      svrServRuleDMO.getSvrPrimaryServ(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrServType",
      svrServRuleDMO.getSvrServType(  ) );

    thrower.ifParameterMissing( "svrServRuleDMO.svrTargetServ",
      svrServRuleDMO.getSvrTargetServ(  ) );

    return svrServRuleDAC.exists( svrServRuleDMO );
  }

  /**
   * Indicates whether a SvrServRule exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SvrServRule exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return svrServRuleDAC.exists( filter );
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

    return svrServRuleDAC.getList( state, filter );
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

    return svrServRuleDAC.iterate( filter );
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

    return svrServRuleDAC.iterateWithLock( filter );
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
  public SvrServRuleDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SvrServRuleDMO
    //
    SvrServRuleDMO svrServRuleDMO = svrServRuleDAC.get( filter );

    return svrServRuleDMO;
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

    return svrServRuleDAC.max( filter );
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

    return svrServRuleDAC.min( filter );
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

    return new Integer(svrServRuleDAC.count( filter ));
  }
}
