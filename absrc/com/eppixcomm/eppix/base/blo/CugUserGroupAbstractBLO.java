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

import com.eppixcomm.eppix.base.blo.BaseBLO;
import com.eppixcomm.eppix.base.blo.BaseMessages;
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
 * V6.
 * <p>
 *   0.03
 * </p>
 *
 * This abstract business logic class holds all the logic for the CugUserGroup class.
 * It is extended by CugUserGroup class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class CugUserGroupAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( CugUserGroup.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CUGG";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected CugUserGroupDAC cugUserGroupDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return CugUserGroupDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.cugUserGroupDAC = (CugUserGroupDAC) dac;
  }

  /**
  * Retrieve a cugUserGroup data model object from persistent storage. The
  * cugUserGroupDMO passed in must contain a valid existing cugUserGroupId.
  * Optionally, the return cugUserGroupDMO may be include a flag that indicates if
  * the cugUserGroup object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the cugUserGroup object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CUGUSERGROUP_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  cugUserGroupDMO the cugUserGroup object that must contain either the
  *         unique cugUserGroupId or the displayCode/languageCode pair
  *
  * @return cugUserGroupDMO the cugUserGroup data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public CugUserGroupDMO get( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(cugUserGroupDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "cugUserGroupDMO", cugUserGroupDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "cugUserGroupDMO.cugId",
      cugUserGroupDMO.getCugId(  ) );

    //
    // Attempt to get the CugUserGroupDMO
    //
    CugUserGroupDMO returnCugUserGroupDMO = cugUserGroupDAC.get( cugUserGroupDMO );

    //
    // Could not find the CugUserGroupDMO
    //
    if ( returnCugUserGroupDMO == null ) {
      thrower.business( Base_CUGUSERGROUP_000,
        new Object[] { cugUserGroupDMO.getCugId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnCugUserGroupDMO;
  }

  /**
   * Return a list of CugUserGroup objects matching the passed in values. A
   * partial match is performed on the description argument and/or the cugUserGroups
   * displayCode. If no values have been passed in, all CugUserGroup objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the CugUserGroup is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param cugUserGroupDMO CugUserGroupDMO object
   *
   * @return DTOList of CugUserGroup objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(
    DTOListState    state,
    CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, cugUserGroupDMO )" );

    return cugUserGroupDAC.getList( state, cugUserGroupDMO );
  }

  /**
  * Creates the CugUserGroup object. As a side effect, following creation
  * of a cugUserGroup an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cugUserGroupDMO cugUserGroupDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cugUserGroupDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CugUserGroupDMO create( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( cugUserGroupDMO )" );

    thrower.ifParameterMissing( "cugUserGroupDMO", cugUserGroupDMO );

    thrower.ifParameterMissing( "cugUserGroupDMO.cugId",
      cugUserGroupDMO.getCugId(  ) );

    thrower.ifParameterMissing( "cugUserGroupDMO.cugName",
      cugUserGroupDMO.getCugName(  ) );

    thrower.ifParameterMissing( "cugUserGroupDMO.cugInternTariff",
      cugUserGroupDMO.getCugInternTariff(  ) );

    //
    // Check that this object does not already exist
    //
    if ( exists( cugUserGroupDMO ) ) {
      thrower.business( Base_CUGUSERGROUP_001,
        new Object[] { cugUserGroupDMO.getCugId(  ) } );
    }

    //
    // Now create the cugUserGroup
    //
    cugUserGroupDAC.create( cugUserGroupDMO );

    return cugUserGroupDMO;
  }

  /**
  * Modifies the CugUserGroup object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CUGUSERGROUP_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cugUserGroupDMO cugUserGroupDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cugUserGroupDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CugUserGroupDMO modify( CugUserGroupDMO aCugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( acugUserGroupDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "acugUserGroupDMO", aCugUserGroupDMO );

    thrower.ifParameterMissing( "aCugUserGroupDMO.cugId",
      aCugUserGroupDMO.getCugId(  ) ); // attribute

    thrower.ifParameterMissing( "aCugUserGroupDMO.cugName",
      aCugUserGroupDMO.getCugName(  ) ); // attribute

    thrower.ifParameterMissing( "aCugUserGroupDMO.cugInternTariff",
      aCugUserGroupDMO.getCugInternTariff(  ) ); // attribute

    CugUserGroupDMO updateCugUserGroupDMO = new CugUserGroupDMO(  );

    updateCugUserGroupDMO.setCugId( aCugUserGroupDMO.getCugId(  ) );

    updateCugUserGroupDMO = get( updateCugUserGroupDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateCugUserGroupDMO.setCugName( aCugUserGroupDMO.getCugName(  ) );

    updateCugUserGroupDMO.setCugInternTariff( aCugUserGroupDMO
      .getCugInternTariff(  ) );

    //
    // Modify the cugUserGroupDMO
    //
    cugUserGroupDAC.modify( updateCugUserGroupDMO );

    // Create a new DMO, set keys, and fetch from the database...
    CugUserGroupDMO returnCugUserGroupDMO = new CugUserGroupDMO(  );

    returnCugUserGroupDMO.setCugId( updateCugUserGroupDMO.getCugId(  ) );

    returnCugUserGroupDMO = get( returnCugUserGroupDMO );

    return returnCugUserGroupDMO;
  }

  /**
  * Modifies the CugUserGroup object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CugUserGroupDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cugUserGroupDMO object.
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
    // Modify the cugUserGroupDMO
    //
    cugUserGroupDAC.modify( filter );
  }

  /**
   * Deletes the CugUserGroup object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_CUGUSERGROUP_003
   *     <li>{@link #Base#CUGUSERGROUP_000} if the CugUserGroup does not exist.</li>
   *     <li>{@link #Base#CUGUSERGROUP_003} if the CugUserGroup is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param CugUserGroupDMO CugUserGroup object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( cugUserGroupDMO )" );

    thrower.ifParameterMissing( "cugUserGroupDMO", cugUserGroupDMO );

    CugUserGroupDMO updateCugUserGroupDMO = null;

    updateCugUserGroupDMO = get( cugUserGroupDMO );

    // delete self...
    cugUserGroupDAC.delete( cugUserGroupDMO );
  }

  /**
   * Deletes the CugUserGroup object.
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
    cugUserGroupDAC.delete( filter );
  }

  /**
  * Indicates whether a CugUserGroup exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the CugUserGroup exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(cugUserGroup)" );

    thrower.ifParameterMissing( "cugUserGroupDMO", cugUserGroupDMO );

    thrower.ifParameterMissing( "cugUserGroupDMO.cugId",
      cugUserGroupDMO.getCugId(  ) );

    return cugUserGroupDAC.exists( cugUserGroupDMO );
  }

  /**
   * Indicates whether a CugUserGroup exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the CugUserGroup exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return cugUserGroupDAC.exists( filter );
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

    return cugUserGroupDAC.getList( state, filter );
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

    return cugUserGroupDAC.iterate( filter );
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

    return cugUserGroupDAC.iterateWithLock( filter );
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
  public CugUserGroupDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the CugUserGroupDMO
    //
    CugUserGroupDMO cugUserGroupDMO = cugUserGroupDAC.get( filter );

    return cugUserGroupDMO;
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

    return cugUserGroupDAC.max( filter );
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

    return cugUserGroupDAC.min( filter );
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

    return new Integer(cugUserGroupDAC.count( filter ));
  }
}
