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
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 *
 * This abstract business logic class holds all the logic for the Opcosm class.
 * It is extended by Opcosm class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class OpcosmAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( OpcosmAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "OPC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected OpcosmDAC opcosmDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return OpcosmDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.opcosmDAC = (OpcosmDAC) dac;
  }

  /**
  * Retrieve a opcosm data model object from persistent storage. The
  * opcosmDMO passed in must contain a valid existing opcosmId.
  * Optionally, the return opcosmDMO may be include a flag that indicates if
  * the opcosm object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the opcosm object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#OPCOSM_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  opcosmDMO the opcosm object that must contain either the
  *         unique opcosmId or the displayCode/languageCode pair
  *
  * @return opcosmDMO the opcosm data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public OpcosmDMO get( OpcosmDMO opcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(opcosmDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "opcosmDMO", opcosmDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "opcosmDMO.costOfSales",
      opcosmDMO.getCostOfSales(  ) );

    //
    // Attempt to get the OpcosmDMO
    //
    OpcosmDMO returnOpcosmDMO = opcosmDAC.get( opcosmDMO );

    //
    // Could not find the OpcosmDMO
    //
    if ( returnOpcosmDMO == null ) {
      thrower.business( Base_OPCOSM_000,
        new Object[] { opcosmDMO.getCostOfSales(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnOpcosmDMO;
  }

  /**
   * Return a list of Opcosm objects matching the passed in values. A
   * partial match is performed on the description argument and/or the opcosms
   * displayCode. If no values have been passed in, all Opcosm objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Opcosm is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param opcosmDMO OpcosmDMO object
   *
   * @return DTOList of Opcosm objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState state,
    OpcosmDMO    opcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, opcosmDMO )" );

    return opcosmDAC.getList( state, opcosmDMO );
  }

  /**
  * Creates the Opcosm object. As a side effect, following creation
  * of a opcosm an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param opcosmDMO opcosmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opcosmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public OpcosmDMO create( OpcosmDMO opcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( opcosmDMO )" );

    thrower.ifParameterMissing( "opcosmDMO", opcosmDMO );

    thrower.ifParameterMissing( "opcosmDMO.costOfSales",
      opcosmDMO.getCostOfSales(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( opcosmDMO ) ) {
      thrower.business( Base_OPCOSM_001,
        new Object[] { opcosmDMO.getCostOfSales(  ) } );
    }

    //
    // Now create the opcosm
    //
    opcosmDAC.create( opcosmDMO );

    return opcosmDMO;
  }

  /**
  * Modifies the Opcosm object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#OPCOSM_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param opcosmDMO opcosmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opcosmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public OpcosmDMO modify( OpcosmDMO aOpcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aopcosmDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aopcosmDMO", aOpcosmDMO );

    thrower.ifParameterMissing( "aOpcosmDMO.costOfSales",
      aOpcosmDMO.getCostOfSales(  ) ); // attribute

    OpcosmDMO updateOpcosmDMO = new OpcosmDMO(  );

    updateOpcosmDMO.setCostOfSales( aOpcosmDMO.getCostOfSales(  ) );

    updateOpcosmDMO = get( updateOpcosmDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateOpcosmDMO.setDescription( aOpcosmDMO.getDescription(  ) );

    updateOpcosmDMO.setSalesAccount( aOpcosmDMO.getSalesAccount(  ) );

    updateOpcosmDMO.setStockAccount( aOpcosmDMO.getStockAccount(  ) );

    updateOpcosmDMO.setCostOfSalesAcc( aOpcosmDMO.getCostOfSalesAcc(  ) );

    updateOpcosmDMO.setUpliftAccount( aOpcosmDMO.getUpliftAccount(  ) );

    updateOpcosmDMO.setUplift( aOpcosmDMO.getUplift(  ) );

    updateOpcosmDMO.setSpare( aOpcosmDMO.getSpare(  ) );

    //
    // Modify the opcosmDMO
    //
    opcosmDAC.modify( updateOpcosmDMO );

    // Create a new DMO, set keys, and fetch from the database...
    OpcosmDMO returnOpcosmDMO = new OpcosmDMO(  );

    returnOpcosmDMO.setCostOfSales( updateOpcosmDMO.getCostOfSales(  ) );

    returnOpcosmDMO = get( returnOpcosmDMO );

    return returnOpcosmDMO;
  }

  /**
  * Modifies the Opcosm object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param OpcosmDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opcosmDMO object.
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
    // Modify the opcosmDMO
    //
    opcosmDAC.modify( filter );
  }

  /**
   * Deletes the Opcosm object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_OPCOSM_003
   *     <li>{@link #Base#OPCOSM_000} if the Opcosm does not exist.</li>
   *     <li>{@link #Base#OPCOSM_003} if the Opcosm is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param OpcosmDMO Opcosm object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( OpcosmDMO opcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( opcosmDMO )" );

    thrower.ifParameterMissing( "opcosmDMO", opcosmDMO );

    OpcosmDMO updateOpcosmDMO = null;

    updateOpcosmDMO = get( opcosmDMO );

    // delete self...
    opcosmDAC.delete( opcosmDMO );
  }

  /**
   * Deletes the Opcosm object.
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
    opcosmDAC.delete( filter );
  }

  /**
  * Indicates whether a Opcosm exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Opcosm exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( OpcosmDMO opcosmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(opcosm)" );

    thrower.ifParameterMissing( "opcosmDMO", opcosmDMO );

    thrower.ifParameterMissing( "opcosmDMO.costOfSales",
      opcosmDMO.getCostOfSales(  ) );

    return opcosmDAC.exists( opcosmDMO );
  }

  /**
   * Indicates whether a Opcosm exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Opcosm exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return opcosmDAC.exists( filter );
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

    return opcosmDAC.getList( state, filter );
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

    return opcosmDAC.iterate( filter );
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

    return opcosmDAC.iterateWithLock( filter );
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
  public OpcosmDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the OpcosmDMO
    //
    OpcosmDMO opcosmDMO = opcosmDAC.get( filter );

    return opcosmDMO;
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

    return opcosmDAC.max( filter );
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

    return opcosmDAC.min( filter );
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

    return new Integer(opcosmDAC.count( filter ));
  }
}
