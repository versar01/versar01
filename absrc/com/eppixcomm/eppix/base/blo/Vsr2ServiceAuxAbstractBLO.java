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
 * Auxilliary to vsr_service The table tells the navigator_list how to order the service information that it returns to the client.
 * <p>
 *   This data is static but is not required by the client and is not being replicated in this phase. The table allow the
 *   navigator to work without a huge quantity of hardcoded data in the code and a long list of different selects. The
 *   fields may look duplicated. They are defined like this to try and provide the data for a fast select and sort, not for
 *   user convienience since they only have to set the data up once, but the select and sort runs very frequently.
 * </p>
 * <p>
 *   How to setup data See the vst_service_type section for information on how to set up service type data. Set the data up like
 *   this
 * </p>
 *
 * This abstract business logic class holds all the logic for the Vsr2ServiceAux class.
 * It is extended by Vsr2ServiceAux class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class Vsr2ServiceAuxAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( Vsr2ServiceAux.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VSRSA";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected Vsr2ServiceAuxDAC vsr2ServiceAuxDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return Vsr2ServiceAuxDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vsr2ServiceAuxDAC = (Vsr2ServiceAuxDAC) dac;
  }

  /**
  * Retrieve a vsr2ServiceAux data model object from persistent storage. The
  * vsr2ServiceAuxDMO passed in must contain a valid existing vsr2ServiceAuxId.
  * Optionally, the return vsr2ServiceAuxDMO may be include a flag that indicates if
  * the vsr2ServiceAux object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vsr2ServiceAux object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSR2SERVICEAUX_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vsr2ServiceAuxDMO the vsr2ServiceAux object that must contain either the
  *         unique vsr2ServiceAuxId or the displayCode/languageCode pair
  *
  * @return vsr2ServiceAuxDMO the vsr2ServiceAux data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public Vsr2ServiceAuxDMO get( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vsr2ServiceAuxDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2ServiceCode",
      vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) );

    //
    // Attempt to get the Vsr2ServiceAuxDMO
    //
    Vsr2ServiceAuxDMO returnVsr2ServiceAuxDMO = vsr2ServiceAuxDAC.get( vsr2ServiceAuxDMO );

    //
    // Could not find the Vsr2ServiceAuxDMO
    //
    if ( returnVsr2ServiceAuxDMO == null ) {
      thrower.business( Base_VSR2SERVICEAUX_000,
        new Object[] { vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVsr2ServiceAuxDMO;
  }

  /**
   * Return a list of Vsr2ServiceAux objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vsr2ServiceAuxs
   * displayCode. If no values have been passed in, all Vsr2ServiceAux objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Vsr2ServiceAux is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vsr2ServiceAuxDMO Vsr2ServiceAuxDMO object
   *
   * @return DTOList of Vsr2ServiceAux objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState      state,
    Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vsr2ServiceAuxDMO )" );

    return vsr2ServiceAuxDAC.getList( state, vsr2ServiceAuxDMO );
  }

  /**
  * Creates the Vsr2ServiceAux object. As a side effect, following creation
  * of a vsr2ServiceAux an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsr2ServiceAuxDMO vsr2ServiceAuxDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsr2ServiceAuxDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public Vsr2ServiceAuxDMO create( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2ServiceCode",
      vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2ServiceOrder",
      vsr2ServiceAuxDMO.getVsr2ServiceOrder(  ) );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2SimRelated",
      vsr2ServiceAuxDMO.getVsr2SimRelated(  ) );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2EntryType",
      vsr2ServiceAuxDMO.getVsr2EntryType(  ) );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2Technology",
      vsr2ServiceAuxDMO.getVsr2Technology(  ) );

//    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2AuthReqd",
//      vsr2ServiceAuxDMO.getVsr2AuthReqd(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vsr2ServiceAuxDMO ) ) {
      thrower.business( Base_VSR2SERVICEAUX_001,
        new Object[] { vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) } );
    }

    //
    // Now create the vsr2ServiceAux
    //
    vsr2ServiceAuxDAC.create( vsr2ServiceAuxDMO );

    return vsr2ServiceAuxDMO;
  }

  /**
  * Modifies the Vsr2ServiceAux object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSR2SERVICEAUX_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsr2ServiceAuxDMO vsr2ServiceAuxDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsr2ServiceAuxDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public Vsr2ServiceAuxDMO modify( Vsr2ServiceAuxDMO aVsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avsr2ServiceAuxDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avsr2ServiceAuxDMO", aVsr2ServiceAuxDMO );

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2ServiceCode",
      aVsr2ServiceAuxDMO.getVsr2ServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2ServiceOrder",
      aVsr2ServiceAuxDMO.getVsr2ServiceOrder(  ) ); // attribute

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2SimRelated",
      aVsr2ServiceAuxDMO.getVsr2SimRelated(  ) ); // attribute

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2EntryType",
      aVsr2ServiceAuxDMO.getVsr2EntryType(  ) ); // attribute

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2Technology",
      aVsr2ServiceAuxDMO.getVsr2Technology(  ) ); // attribute

//    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO.vsr2AuthReqd",
//      aVsr2ServiceAuxDMO.getVsr2AuthReqd(  ) ); // attribute

    Vsr2ServiceAuxDMO updateVsr2ServiceAuxDMO = new Vsr2ServiceAuxDMO(  );

    updateVsr2ServiceAuxDMO.setVsr2ServiceCode( aVsr2ServiceAuxDMO
      .getVsr2ServiceCode(  ) );

    updateVsr2ServiceAuxDMO = get( updateVsr2ServiceAuxDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVsr2ServiceAuxDMO.setVsr2ServiceOrder( aVsr2ServiceAuxDMO
      .getVsr2ServiceOrder(  ) );

    updateVsr2ServiceAuxDMO.setVsr2SimRelated( aVsr2ServiceAuxDMO
      .getVsr2SimRelated(  ) );

    updateVsr2ServiceAuxDMO.setVsr2EntryType( aVsr2ServiceAuxDMO
      .getVsr2EntryType(  ) );

    updateVsr2ServiceAuxDMO.setVsr2Technology( aVsr2ServiceAuxDMO
      .getVsr2Technology(  ) );

//    updateVsr2ServiceAuxDMO.setVsr2AuthReqd( aVsr2ServiceAuxDMO
//      .getVsr2AuthReqd(  ) );

    //
    // Modify the vsr2ServiceAuxDMO
    //
    vsr2ServiceAuxDAC.modify( updateVsr2ServiceAuxDMO );

    // Create a new DMO, set keys, and fetch from the database...
    Vsr2ServiceAuxDMO returnVsr2ServiceAuxDMO = new Vsr2ServiceAuxDMO(  );

    returnVsr2ServiceAuxDMO.setVsr2ServiceCode( updateVsr2ServiceAuxDMO
      .getVsr2ServiceCode(  ) );

    returnVsr2ServiceAuxDMO = get( returnVsr2ServiceAuxDMO );

    return returnVsr2ServiceAuxDMO;
  }

  /**
  * Modifies the Vsr2ServiceAux object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param Vsr2ServiceAuxDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsr2ServiceAuxDMO object.
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
    // Modify the vsr2ServiceAuxDMO
    //
    vsr2ServiceAuxDAC.modify( filter );
  }

  /**
   * Deletes the Vsr2ServiceAux object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VSR2SERVICEAUX_003
   *     <li>{@link #Base#VSR2SERVICEAUX_000} if the Vsr2ServiceAux does not exist.</li>
   *     <li>{@link #Base#VSR2SERVICEAUX_003} if the Vsr2ServiceAux is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param Vsr2ServiceAuxDMO Vsr2ServiceAux object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    Vsr2ServiceAuxDMO updateVsr2ServiceAuxDMO = null;

    updateVsr2ServiceAuxDMO = get( vsr2ServiceAuxDMO );

    // delete self...
    vsr2ServiceAuxDAC.delete( vsr2ServiceAuxDMO );
  }

  /**
   * Deletes the Vsr2ServiceAux object.
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
    vsr2ServiceAuxDAC.delete( filter );
  }

  /**
  * Indicates whether a Vsr2ServiceAux exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Vsr2ServiceAux exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vsr2ServiceAux)" );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    thrower.ifParameterMissing( "vsr2ServiceAuxDMO.vsr2ServiceCode",
      vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) );

    return vsr2ServiceAuxDAC.exists( vsr2ServiceAuxDMO );
  }

  /**
   * Indicates whether a Vsr2ServiceAux exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Vsr2ServiceAux exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vsr2ServiceAuxDAC.exists( filter );
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

    return vsr2ServiceAuxDAC.getList( state, filter );
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

    return vsr2ServiceAuxDAC.iterate( filter );
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

    return vsr2ServiceAuxDAC.iterateWithLock( filter );
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
  public Vsr2ServiceAuxDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the Vsr2ServiceAuxDMO
    //
    Vsr2ServiceAuxDMO vsr2ServiceAuxDMO = vsr2ServiceAuxDAC.get( filter );

    return vsr2ServiceAuxDMO;
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

    return vsr2ServiceAuxDAC.max( filter );
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

    return vsr2ServiceAuxDAC.min( filter );
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

    return new Integer(vsr2ServiceAuxDAC.count( filter ));
  }
}
