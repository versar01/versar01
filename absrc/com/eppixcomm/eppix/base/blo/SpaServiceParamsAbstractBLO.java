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
 * Defines the parameters relevant to services of this parameterised service type.
 * <p>
 *   A group of records will exist for each Parameterised Service Type record on vst_service_types.
 * </p>
 * <p>
 *   A tt_type_text group will exist for each parameter. The group name will be the same as the parameter name. The records in
 *   the group for a given parameter will provide a list of the valid values for that parameter.
 * </p>
 *
 * This abstract business logic class holds all the logic for the SpaServiceParams class.
 * It is extended by SpaServiceParams class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SpaServiceParamsAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SpaServiceParamsAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SPAP";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SpaServiceParamsDAC spaServiceParamsDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return SpaServiceParamsDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.spaServiceParamsDAC = (SpaServiceParamsDAC) dac;
  }

  /**
  * Retrieve a spaServiceParams data model object from persistent storage. The
  * spaServiceParamsDMO passed in must contain a valid existing spaServiceParamsId.
  * Optionally, the return spaServiceParamsDMO may be include a flag that indicates if
  * the spaServiceParams object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the spaServiceParams object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SPASERVICEPARAMS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  spaServiceParamsDMO the spaServiceParams object that must contain either the
  *         unique spaServiceParamsId or the displayCode/languageCode pair
  *
  * @return spaServiceParamsDMO the spaServiceParams data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SpaServiceParamsDMO get( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(spaServiceParamsDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "spaServiceParamsDMO", spaServiceParamsDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "spaServiceParamsDMO.spaServiceType",
      spaServiceParamsDMO.getSpaServiceType(  ) );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaParamId",
      spaServiceParamsDMO.getSpaParamId(  ) );

    //
    // Attempt to get the SpaServiceParamsDMO
    //
    SpaServiceParamsDMO returnSpaServiceParamsDMO = spaServiceParamsDAC.get( spaServiceParamsDMO );

    //
    // Could not find the SpaServiceParamsDMO
    //
    if ( returnSpaServiceParamsDMO == null ) {
      thrower.business( Base_SPASERVICEPARAMS_000,
        new Object[] {
          spaServiceParamsDMO.getSpaServiceType(  ),
          spaServiceParamsDMO.getSpaParamId(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSpaServiceParamsDMO;
  }

  /**
   * Return a list of SpaServiceParams objects matching the passed in values. A
   * partial match is performed on the description argument and/or the spaServiceParamss
   * displayCode. If no values have been passed in, all SpaServiceParams objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SpaServiceParams is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param spaServiceParamsDMO SpaServiceParamsDMO object
   *
   * @return DTOList of SpaServiceParams objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState        state,
    SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, spaServiceParamsDMO )" );

    return spaServiceParamsDAC.getList( state, spaServiceParamsDMO );
  }

  /**
  * Creates the SpaServiceParams object. As a side effect, following creation
  * of a spaServiceParams an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param spaServiceParamsDMO spaServiceParamsDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spaServiceParamsDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SpaServiceParamsDMO create( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( spaServiceParamsDMO )" );

    thrower.ifParameterMissing( "spaServiceParamsDMO", spaServiceParamsDMO );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaServiceType",
      spaServiceParamsDMO.getSpaServiceType(  ) );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaParamId",
      spaServiceParamsDMO.getSpaParamId(  ) );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaDefaultVal",
      spaServiceParamsDMO.getSpaDefaultVal(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( spaServiceParamsDMO ) ) {
      thrower.business( Base_SPASERVICEPARAMS_001,
        new Object[] {
          spaServiceParamsDMO.getSpaServiceType(  ),
          spaServiceParamsDMO.getSpaParamId(  )
        } );
    }

    //
    // Now create the spaServiceParams
    //
    spaServiceParamsDAC.create( spaServiceParamsDMO );

    return spaServiceParamsDMO;
  }

  /**
  * Modifies the SpaServiceParams object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SPASERVICEPARAMS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param spaServiceParamsDMO spaServiceParamsDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spaServiceParamsDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SpaServiceParamsDMO modify( 
    SpaServiceParamsDMO aSpaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aspaServiceParamsDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aspaServiceParamsDMO", aSpaServiceParamsDMO );

    thrower.ifParameterMissing( "aSpaServiceParamsDMO.spaServiceType",
      aSpaServiceParamsDMO.getSpaServiceType(  ) ); // attribute

    thrower.ifParameterMissing( "aSpaServiceParamsDMO.spaParamId",
      aSpaServiceParamsDMO.getSpaParamId(  ) ); // attribute

    thrower.ifParameterMissing( "aSpaServiceParamsDMO.spaDefaultVal",
      aSpaServiceParamsDMO.getSpaDefaultVal(  ) ); // attribute

    SpaServiceParamsDMO updateSpaServiceParamsDMO = new SpaServiceParamsDMO(  );

    updateSpaServiceParamsDMO.setSpaServiceType( aSpaServiceParamsDMO
      .getSpaServiceType(  ) );

    updateSpaServiceParamsDMO.setSpaParamId( aSpaServiceParamsDMO
      .getSpaParamId(  ) );

    updateSpaServiceParamsDMO = get( updateSpaServiceParamsDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSpaServiceParamsDMO.setSpaParamName( aSpaServiceParamsDMO
      .getSpaParamName(  ) );

    updateSpaServiceParamsDMO.setSpaDefaultVal( aSpaServiceParamsDMO
      .getSpaDefaultVal(  ) );

    //
    // Modify the spaServiceParamsDMO
    //
    spaServiceParamsDAC.modify( updateSpaServiceParamsDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SpaServiceParamsDMO returnSpaServiceParamsDMO = new SpaServiceParamsDMO(  );

    returnSpaServiceParamsDMO.setSpaServiceType( updateSpaServiceParamsDMO
      .getSpaServiceType(  ) );

    returnSpaServiceParamsDMO.setSpaParamId( updateSpaServiceParamsDMO
      .getSpaParamId(  ) );

    returnSpaServiceParamsDMO = get( returnSpaServiceParamsDMO );

    return returnSpaServiceParamsDMO;
  }

  /**
  * Modifies the SpaServiceParams object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SpaServiceParamsDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spaServiceParamsDMO object.
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
    // Modify the spaServiceParamsDMO
    //
    spaServiceParamsDAC.modify( filter );
  }

  /**
   * Deletes the SpaServiceParams object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SPASERVICEPARAMS_003
   *     <li>{@link #Base#SPASERVICEPARAMS_000} if the SpaServiceParams does not exist.</li>
   *     <li>{@link #Base#SPASERVICEPARAMS_003} if the SpaServiceParams is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SpaServiceParamsDMO SpaServiceParams object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( spaServiceParamsDMO )" );

    thrower.ifParameterMissing( "spaServiceParamsDMO", spaServiceParamsDMO );

    SpaServiceParamsDMO updateSpaServiceParamsDMO = null;

    updateSpaServiceParamsDMO = get( spaServiceParamsDMO );

    // delete self...
    spaServiceParamsDAC.delete( spaServiceParamsDMO );
  }

  /**
   * Deletes the SpaServiceParams object.
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
    spaServiceParamsDAC.delete( filter );
  }

  /**
  * Indicates whether a SpaServiceParams exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the SpaServiceParams exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(spaServiceParams)" );

    thrower.ifParameterMissing( "spaServiceParamsDMO", spaServiceParamsDMO );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaServiceType",
      spaServiceParamsDMO.getSpaServiceType(  ) );

    thrower.ifParameterMissing( "spaServiceParamsDMO.spaParamId",
      spaServiceParamsDMO.getSpaParamId(  ) );

    return spaServiceParamsDAC.exists( spaServiceParamsDMO );
  }

  /**
   * Indicates whether a SpaServiceParams exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SpaServiceParams exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return spaServiceParamsDAC.exists( filter );
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

    return spaServiceParamsDAC.getList( state, filter );
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

    return spaServiceParamsDAC.iterate( filter );
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

    return spaServiceParamsDAC.iterateWithLock( filter );
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
  public SpaServiceParamsDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SpaServiceParamsDMO
    //
    SpaServiceParamsDMO spaServiceParamsDMO = spaServiceParamsDAC.get( filter );

    return spaServiceParamsDMO;
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

    return spaServiceParamsDAC.max( filter );
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

    return spaServiceParamsDAC.min( filter );
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

    return new Integer(spaServiceParamsDAC.count( filter ));
  }
}
