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
 * There are some (many) services that require EPPIX to perform special activities.
 * <p>
 *   A service_type is used to identify which sorts of actions are required. This table lists these hardcodes and gives them
 *   a meaning that the users can understand. A list of hardcodes follows the table layout.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VstServiceTypes class.
 * It is extended by VstServiceTypes class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VstServiceTypesAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VstServiceTypes.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VSTT";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VstServiceTypesDAC vstServiceTypesDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VstServiceTypesDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vstServiceTypesDAC = (VstServiceTypesDAC) dac;
  }

  /**
  * Retrieve a vstServiceTypes data model object from persistent storage. The
  * vstServiceTypesDMO passed in must contain a valid existing vstServiceTypesId.
  * Optionally, the return vstServiceTypesDMO may be include a flag that indicates if
  * the vstServiceTypes object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vstServiceTypes object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSTSERVICETYPES_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vstServiceTypesDMO the vstServiceTypes object that must contain either the
  *         unique vstServiceTypesId or the displayCode/languageCode pair
  *
  * @return vstServiceTypesDMO the vstServiceTypes data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VstServiceTypesDMO get( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vstServiceTypesDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vstServiceTypesDMO", vstServiceTypesDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vstServiceTypesDMO.vstServiceType",
      vstServiceTypesDMO.getVstServiceType(  ) );

    //
    // Attempt to get the VstServiceTypesDMO
    //
    VstServiceTypesDMO returnVstServiceTypesDMO = vstServiceTypesDAC.get( vstServiceTypesDMO );

    //
    // Could not find the VstServiceTypesDMO
    //
    if ( returnVstServiceTypesDMO == null ) {
      thrower.business( Base_VSTSERVICETYPES_000,
        new Object[] { vstServiceTypesDMO.getVstServiceType(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVstServiceTypesDMO;
  }

  /**
   * Return a list of VstServiceTypes objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vstServiceTypess
   * displayCode. If no values have been passed in, all VstServiceTypes objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VstServiceTypes is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vstServiceTypesDMO VstServiceTypesDMO object
   *
   * @return DTOList of VstServiceTypes objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vstServiceTypesDMO )" );

    return vstServiceTypesDAC.getList( state, vstServiceTypesDMO );
  }

  /**
  * Creates the VstServiceTypes object. As a side effect, following creation
  * of a vstServiceTypes an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vstServiceTypesDMO vstServiceTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vstServiceTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VstServiceTypesDMO create( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vstServiceTypesDMO )" );

    thrower.ifParameterMissing( "vstServiceTypesDMO", vstServiceTypesDMO );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstServiceType",
      vstServiceTypesDMO.getVstServiceType(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstServiceDesc",
      vstServiceTypesDMO.getVstServiceDesc(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstMultiCharge",
      vstServiceTypesDMO.getVstMultiCharge(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstServiceClass",
      vstServiceTypesDMO.getVstServiceClass(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstAutoConnect",
      vstServiceTypesDMO.getVstAutoConnect(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstOriginator",
      vstServiceTypesDMO.getVstOriginator(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstTariffRelated",
      vstServiceTypesDMO.getVstTariffRelated(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstParameterised",
      vstServiceTypesDMO.getVstParameterised(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstArchiveMonths",
      vstServiceTypesDMO.getVstArchiveMonths(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstFutureAct",
      vstServiceTypesDMO.getVstFutureAct(  ) );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstNodeLevel",
      vstServiceTypesDMO.getVstNodeLevel(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vstServiceTypesDMO ) ) {
      thrower.business( Base_VSTSERVICETYPES_001,
        new Object[] { vstServiceTypesDMO.getVstServiceType(  ) } );
    }

    //
    // Now create the vstServiceTypes
    //
    vstServiceTypesDAC.create( vstServiceTypesDMO );

    return vstServiceTypesDMO;
  }

  /**
  * Modifies the VstServiceTypes object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSTSERVICETYPES_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vstServiceTypesDMO vstServiceTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vstServiceTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VstServiceTypesDMO modify( VstServiceTypesDMO aVstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avstServiceTypesDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avstServiceTypesDMO", aVstServiceTypesDMO );

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstServiceType",
      aVstServiceTypesDMO.getVstServiceType(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstServiceDesc",
      aVstServiceTypesDMO.getVstServiceDesc(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstMultiCharge",
      aVstServiceTypesDMO.getVstMultiCharge(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstServiceClass",
      aVstServiceTypesDMO.getVstServiceClass(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstAutoConnect",
      aVstServiceTypesDMO.getVstAutoConnect(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstOriginator",
      aVstServiceTypesDMO.getVstOriginator(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstTariffRelated",
      aVstServiceTypesDMO.getVstTariffRelated(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstParameterised",
      aVstServiceTypesDMO.getVstParameterised(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstArchiveMonths",
      aVstServiceTypesDMO.getVstArchiveMonths(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstFutureAct",
      aVstServiceTypesDMO.getVstFutureAct(  ) ); // attribute

    thrower.ifParameterMissing( "aVstServiceTypesDMO.vstNodeLevel",
      aVstServiceTypesDMO.getVstNodeLevel(  ) ); // attribute

    VstServiceTypesDMO updateVstServiceTypesDMO = new VstServiceTypesDMO(  );

    updateVstServiceTypesDMO.setVstServiceType( aVstServiceTypesDMO
      .getVstServiceType(  ) );

    updateVstServiceTypesDMO = get( updateVstServiceTypesDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVstServiceTypesDMO.setVstServiceDesc( aVstServiceTypesDMO
      .getVstServiceDesc(  ) );

    updateVstServiceTypesDMO.setVstMultiCharge( aVstServiceTypesDMO
      .getVstMultiCharge(  ) );

    updateVstServiceTypesDMO.setVstServiceClass( aVstServiceTypesDMO
      .getVstServiceClass(  ) );

    updateVstServiceTypesDMO.setVstAutoConnect( aVstServiceTypesDMO
      .getVstAutoConnect(  ) );

    updateVstServiceTypesDMO.setVstOriginator( aVstServiceTypesDMO
      .getVstOriginator(  ) );

    updateVstServiceTypesDMO.setVstTariffRelated( aVstServiceTypesDMO
      .getVstTariffRelated(  ) );

    updateVstServiceTypesDMO.setVstParameterised( aVstServiceTypesDMO
      .getVstParameterised(  ) );

    updateVstServiceTypesDMO.setVstParamsLevel( aVstServiceTypesDMO
      .getVstParamsLevel(  ) );

    updateVstServiceTypesDMO.setVstArchiveMonths( aVstServiceTypesDMO
      .getVstArchiveMonths(  ) );

    updateVstServiceTypesDMO.setVstFutureAct( aVstServiceTypesDMO
      .getVstFutureAct(  ) );

    updateVstServiceTypesDMO.setVstNodeLevel( aVstServiceTypesDMO
      .getVstNodeLevel(  ) );

    //
    // Modify the vstServiceTypesDMO
    //
    vstServiceTypesDAC.modify( updateVstServiceTypesDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VstServiceTypesDMO returnVstServiceTypesDMO = new VstServiceTypesDMO(  );

    returnVstServiceTypesDMO.setVstServiceType( updateVstServiceTypesDMO
      .getVstServiceType(  ) );

    returnVstServiceTypesDMO = get( returnVstServiceTypesDMO );

    return returnVstServiceTypesDMO;
  }

  /**
  * Modifies the VstServiceTypes object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VstServiceTypesDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vstServiceTypesDMO object.
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
    // Modify the vstServiceTypesDMO
    //
    vstServiceTypesDAC.modify( filter );
  }

  /**
   * Deletes the VstServiceTypes object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VSTSERVICETYPES_003
   *     <li>{@link #Base#VSTSERVICETYPES_000} if the VstServiceTypes does not exist.</li>
   *     <li>{@link #Base#VSTSERVICETYPES_003} if the VstServiceTypes is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VstServiceTypesDMO VstServiceTypes object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vstServiceTypesDMO )" );

    thrower.ifParameterMissing( "vstServiceTypesDMO", vstServiceTypesDMO );

    VstServiceTypesDMO updateVstServiceTypesDMO = null;

    updateVstServiceTypesDMO = get( vstServiceTypesDMO );

    // delete self...
    vstServiceTypesDAC.delete( vstServiceTypesDMO );
  }

  /**
   * Deletes the VstServiceTypes object.
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
    vstServiceTypesDAC.delete( filter );
  }

  /**
  * Indicates whether a VstServiceTypes exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VstServiceTypes exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vstServiceTypes)" );

    thrower.ifParameterMissing( "vstServiceTypesDMO", vstServiceTypesDMO );

    thrower.ifParameterMissing( "vstServiceTypesDMO.vstServiceType",
      vstServiceTypesDMO.getVstServiceType(  ) );

    return vstServiceTypesDAC.exists( vstServiceTypesDMO );
  }

  /**
   * Indicates whether a VstServiceTypes exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VstServiceTypes exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vstServiceTypesDAC.exists( filter );
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

    return vstServiceTypesDAC.getList( state, filter );
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

    return vstServiceTypesDAC.iterate( filter );
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

    return vstServiceTypesDAC.iterateWithLock( filter );
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
  public VstServiceTypesDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VstServiceTypesDMO
    //
    VstServiceTypesDMO vstServiceTypesDMO = vstServiceTypesDAC.get( filter );

    return vstServiceTypesDMO;
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

    return vstServiceTypesDAC.max( filter );
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

    return vstServiceTypesDAC.min( filter );
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

    return new Integer(vstServiceTypesDAC.count( filter ));
  }
}
