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
 * Holds the node 2 node text sequences required for activation/deactivation of services.
 * <p>
 *   Also allows grouping of non-basic network originated services.
 * </p>
 *
 * This abstract business logic class holds all the logic for the NgsNetGroupServ class.
 * It is extended by NgsNetGroupServ class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class NgsNetGroupServAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( NgsNetGroupServ.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "NGSGS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected NgsNetGroupServDAC ngsNetGroupServDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return NgsNetGroupServDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.ngsNetGroupServDAC = (NgsNetGroupServDAC) dac;
  }

  /**
  * Retrieve a ngsNetGroupServ data model object from persistent storage. The
  * ngsNetGroupServDMO passed in must contain a valid existing ngsNetGroupServId.
  * Optionally, the return ngsNetGroupServDMO may be include a flag that indicates if
  * the ngsNetGroupServ object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the ngsNetGroupServ object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NGSNETGROUPSERV_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  ngsNetGroupServDMO the ngsNetGroupServ object that must contain either the
  *         unique ngsNetGroupServId or the displayCode/languageCode pair
  *
  * @return ngsNetGroupServDMO the ngsNetGroupServ data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public NgsNetGroupServDMO get( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(ngsNetGroupServDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "ngsNetGroupServDMO", ngsNetGroupServDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsCode",
      ngsNetGroupServDMO.getNgsCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetwork",
      ngsNetGroupServDMO.getNgsNetwork(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetServCode",
      ngsNetGroupServDMO.getNgsNetServCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsSequence",
      ngsNetGroupServDMO.getNgsSequence(  ) );

    //
    // Attempt to get the NgsNetGroupServDMO
    //
    NgsNetGroupServDMO returnNgsNetGroupServDMO = ngsNetGroupServDAC.get( ngsNetGroupServDMO );

    //
    // Could not find the NgsNetGroupServDMO
    //
    if ( returnNgsNetGroupServDMO == null ) {
      thrower.business( Base_NGSNETGROUPSERV_000,
        new Object[] {
          ngsNetGroupServDMO.getNgsCode(  ),
          ngsNetGroupServDMO.getNgsNetwork(  ),
          ngsNetGroupServDMO.getNgsNetServCode(  ),
          ngsNetGroupServDMO.getNgsSequence(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnNgsNetGroupServDMO;
  }

  /**
   * Return a list of NgsNetGroupServ objects matching the passed in values. A
   * partial match is performed on the description argument and/or the ngsNetGroupServs
   * displayCode. If no values have been passed in, all NgsNetGroupServ objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the NgsNetGroupServ is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param ngsNetGroupServDMO NgsNetGroupServDMO object
   *
   * @return DTOList of NgsNetGroupServ objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, ngsNetGroupServDMO )" );

    return ngsNetGroupServDAC.getList( state, ngsNetGroupServDMO );
  }

  /**
  * Creates the NgsNetGroupServ object. As a side effect, following creation
  * of a ngsNetGroupServ an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ngsNetGroupServDMO ngsNetGroupServDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ngsNetGroupServDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public NgsNetGroupServDMO create( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( ngsNetGroupServDMO )" );

    thrower.ifParameterMissing( "ngsNetGroupServDMO", ngsNetGroupServDMO );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsCode",
      ngsNetGroupServDMO.getNgsCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetwork",
      ngsNetGroupServDMO.getNgsNetwork(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetServCode",
      ngsNetGroupServDMO.getNgsNetServCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsSequence",
      ngsNetGroupServDMO.getNgsSequence(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( ngsNetGroupServDMO ) ) {
      thrower.business( Base_NGSNETGROUPSERV_001,
        new Object[] {
          ngsNetGroupServDMO.getNgsCode(  ),
          ngsNetGroupServDMO.getNgsNetwork(  ),
          ngsNetGroupServDMO.getNgsNetServCode(  ),
          ngsNetGroupServDMO.getNgsSequence(  )
        } );
    }

    //
    // Now create the ngsNetGroupServ
    //
    ngsNetGroupServDAC.create( ngsNetGroupServDMO );

    return ngsNetGroupServDMO;
  }

  /**
  * Modifies the NgsNetGroupServ object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NGSNETGROUPSERV_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ngsNetGroupServDMO ngsNetGroupServDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ngsNetGroupServDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public NgsNetGroupServDMO modify( NgsNetGroupServDMO aNgsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( angsNetGroupServDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "angsNetGroupServDMO", aNgsNetGroupServDMO );

    thrower.ifParameterMissing( "aNgsNetGroupServDMO.ngsCode",
      aNgsNetGroupServDMO.getNgsCode(  ) ); // attribute

    thrower.ifParameterMissing( "aNgsNetGroupServDMO.ngsNetwork",
      aNgsNetGroupServDMO.getNgsNetwork(  ) ); // attribute

    thrower.ifParameterMissing( "aNgsNetGroupServDMO.ngsNetServCode",
      aNgsNetGroupServDMO.getNgsNetServCode(  ) ); // attribute

    thrower.ifParameterMissing( "aNgsNetGroupServDMO.ngsSequence",
      aNgsNetGroupServDMO.getNgsSequence(  ) ); // attribute

    NgsNetGroupServDMO updateNgsNetGroupServDMO = new NgsNetGroupServDMO(  );

    updateNgsNetGroupServDMO.setNgsCode( aNgsNetGroupServDMO.getNgsCode(  ) );

    updateNgsNetGroupServDMO.setNgsNetwork( aNgsNetGroupServDMO.getNgsNetwork(  ) );

    updateNgsNetGroupServDMO.setNgsNetServCode( aNgsNetGroupServDMO
      .getNgsNetServCode(  ) );

    updateNgsNetGroupServDMO.setNgsSequence( aNgsNetGroupServDMO
      .getNgsSequence(  ) );

    updateNgsNetGroupServDMO = get( updateNgsNetGroupServDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateNgsNetGroupServDMO.setNgsApplyText( aNgsNetGroupServDMO
      .getNgsApplyText(  ) );

    updateNgsNetGroupServDMO.setNgsModifyText( aNgsNetGroupServDMO
      .getNgsModifyText(  ) );

    updateNgsNetGroupServDMO.setNgsRemoveText( aNgsNetGroupServDMO
      .getNgsRemoveText(  ) );

    updateNgsNetGroupServDMO.setNgsParamName1( aNgsNetGroupServDMO
      .getNgsParamName1(  ) );

    updateNgsNetGroupServDMO.setNgsParamValue1( aNgsNetGroupServDMO
      .getNgsParamValue1(  ) );

    updateNgsNetGroupServDMO.setNgsParamName2( aNgsNetGroupServDMO
      .getNgsParamName2(  ) );

    updateNgsNetGroupServDMO.setNgsParamValue2( aNgsNetGroupServDMO
      .getNgsParamValue2(  ) );

    updateNgsNetGroupServDMO.setNgsParamName3( aNgsNetGroupServDMO
      .getNgsParamName3(  ) );

    updateNgsNetGroupServDMO.setNgsParamValue3( aNgsNetGroupServDMO
      .getNgsParamValue3(  ) );

    updateNgsNetGroupServDMO.setNgsParamName4( aNgsNetGroupServDMO
      .getNgsParamName4(  ) );

    updateNgsNetGroupServDMO.setNgsParamValue4( aNgsNetGroupServDMO
      .getNgsParamValue4(  ) );

    updateNgsNetGroupServDMO.setNgsParamName5( aNgsNetGroupServDMO
      .getNgsParamName5(  ) );

    updateNgsNetGroupServDMO.setNgsParamValue5( aNgsNetGroupServDMO
      .getNgsParamValue5(  ) );

    //
    // Modify the ngsNetGroupServDMO
    //
    ngsNetGroupServDAC.modify( updateNgsNetGroupServDMO );

    // Create a new DMO, set keys, and fetch from the database...
    NgsNetGroupServDMO returnNgsNetGroupServDMO = new NgsNetGroupServDMO(  );

    returnNgsNetGroupServDMO.setNgsCode( updateNgsNetGroupServDMO.getNgsCode(  ) );

    returnNgsNetGroupServDMO.setNgsNetwork( updateNgsNetGroupServDMO
      .getNgsNetwork(  ) );

    returnNgsNetGroupServDMO.setNgsNetServCode( updateNgsNetGroupServDMO
      .getNgsNetServCode(  ) );

    returnNgsNetGroupServDMO.setNgsSequence( updateNgsNetGroupServDMO
      .getNgsSequence(  ) );

    returnNgsNetGroupServDMO = get( returnNgsNetGroupServDMO );

    return returnNgsNetGroupServDMO;
  }

  /**
  * Modifies the NgsNetGroupServ object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param NgsNetGroupServDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ngsNetGroupServDMO object.
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
    // Modify the ngsNetGroupServDMO
    //
    ngsNetGroupServDAC.modify( filter );
  }

  /**
   * Deletes the NgsNetGroupServ object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_NGSNETGROUPSERV_003
   *     <li>{@link #Base#NGSNETGROUPSERV_000} if the NgsNetGroupServ does not exist.</li>
   *     <li>{@link #Base#NGSNETGROUPSERV_003} if the NgsNetGroupServ is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param NgsNetGroupServDMO NgsNetGroupServ object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( ngsNetGroupServDMO )" );

    thrower.ifParameterMissing( "ngsNetGroupServDMO", ngsNetGroupServDMO );

    NgsNetGroupServDMO updateNgsNetGroupServDMO = null;

    updateNgsNetGroupServDMO = get( ngsNetGroupServDMO );

    // delete self...
    ngsNetGroupServDAC.delete( ngsNetGroupServDMO );
  }

  /**
   * Deletes the NgsNetGroupServ object.
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
    ngsNetGroupServDAC.delete( filter );
  }

  /**
  * Indicates whether a NgsNetGroupServ exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the NgsNetGroupServ exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(ngsNetGroupServ)" );

    thrower.ifParameterMissing( "ngsNetGroupServDMO", ngsNetGroupServDMO );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsCode",
      ngsNetGroupServDMO.getNgsCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetwork",
      ngsNetGroupServDMO.getNgsNetwork(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsNetServCode",
      ngsNetGroupServDMO.getNgsNetServCode(  ) );

    thrower.ifParameterMissing( "ngsNetGroupServDMO.ngsSequence",
      ngsNetGroupServDMO.getNgsSequence(  ) );

    return ngsNetGroupServDAC.exists( ngsNetGroupServDMO );
  }

  /**
   * Indicates whether a NgsNetGroupServ exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the NgsNetGroupServ exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return ngsNetGroupServDAC.exists( filter );
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

    return ngsNetGroupServDAC.getList( state, filter );
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

    return ngsNetGroupServDAC.iterate( filter );
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

    return ngsNetGroupServDAC.iterateWithLock( filter );
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
  public NgsNetGroupServDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the NgsNetGroupServDMO
    //
    NgsNetGroupServDMO ngsNetGroupServDMO = ngsNetGroupServDAC.get( filter );

    return ngsNetGroupServDMO;
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

    return ngsNetGroupServDAC.max( filter );
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

    return ngsNetGroupServDAC.min( filter );
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

    return new Integer(ngsNetGroupServDAC.count( filter ));
  }
}
