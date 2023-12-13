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
 * This abstract business logic class holds all the logic for the Opservm class.
 * It is extended by Opservm class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class OpservmAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( Opservm.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "OPS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected OpservmDAC opservmDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  public Class getDACClass(  ) {
    return OpservmDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.opservmDAC = (OpservmDAC) dac;
  }

  /**
  * Retrieve a opservm data model object from persistent storage. The
  * opservmDMO passed in must contain a valid existing opservmId.
  * Optionally, the return opservmDMO may be include a flag that indicates if
  * the opservm object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the opservm object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#OPSERVM_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  opservmDMO the opservm object that must contain either the
  *         unique opservmId or the displayCode/languageCode pair
  *
  * @return opservmDMO the opservm data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public OpservmDMO get( OpservmDMO opservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(opservmDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "opservmDMO", opservmDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "opservmDMO.product",
      opservmDMO.getProduct(  ) );

    //
    // Attempt to get the OpservmDMO
    //
    OpservmDMO returnOpservmDMO = opservmDAC.get( opservmDMO );

    //
    // Could not find the OpservmDMO
    //
    if ( returnOpservmDMO == null ) {
      thrower.business( Base_OPSERVM_000,
        new Object[] { opservmDMO.getProduct(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnOpservmDMO;
  }

  /**
   * Return a list of Opservm objects matching the passed in values. A
   * partial match is performed on the description argument and/or the opservms
   * displayCode. If no values have been passed in, all Opservm objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Opservm is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param opservmDMO OpservmDMO object
   *
   * @return DTOList of Opservm objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState state,
    OpservmDMO   opservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, opservmDMO )" );

    return opservmDAC.getList( state, opservmDMO );
  }

  /**
  * Creates the Opservm object. As a side effect, following creation
  * of a opservm an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param opservmDMO opservmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opservmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public OpservmDMO create( OpservmDMO opservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( opservmDMO )" );

    thrower.ifParameterMissing( "opservmDMO", opservmDMO );

    thrower.ifParameterMissing( "opservmDMO.product",
      opservmDMO.getProduct(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( opservmDMO ) ) {
      thrower.business( Base_OPSERVM_001,
        new Object[] { opservmDMO.getProduct(  ) } );
    }

    //
    // Now create the opservm
    //
    opservmDAC.create( opservmDMO );

    return opservmDMO;
  }

  /**
  * Modifies the Opservm object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#OPSERVM_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param opservmDMO opservmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opservmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public OpservmDMO modify( OpservmDMO aOpservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aopservmDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aopservmDMO", aOpservmDMO );

    thrower.ifParameterMissing( "aOpservmDMO.product",
      aOpservmDMO.getProduct(  ) ); // attribute

    OpservmDMO updateOpservmDMO = new OpservmDMO(  );

    updateOpservmDMO.setProduct( aOpservmDMO.getProduct(  ) );

    updateOpservmDMO = get( updateOpservmDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateOpservmDMO.setDescription( aOpservmDMO.getDescription(  ) );

    updateOpservmDMO.setLongDescription( aOpservmDMO.getLongDescription(  ) );

    updateOpservmDMO.setUnitOfSale( aOpservmDMO.getUnitOfSale(  ) );

    updateOpservmDMO.setVatCategory( aOpservmDMO.getVatCategory(  ) );

    updateOpservmDMO.setProdDiscCode( aOpservmDMO.getProdDiscCode(  ) );

    updateOpservmDMO.setNominalCategory( aOpservmDMO.getNominalCategory(  ) );

    updateOpservmDMO.setProductGroupA( aOpservmDMO.getProductGroupA(  ) );

    updateOpservmDMO.setProductGroupB( aOpservmDMO.getProductGroupB(  ) );

    updateOpservmDMO.setProductGroupC( aOpservmDMO.getProductGroupC(  ) );

    updateOpservmDMO.setListPrice( aOpservmDMO.getListPrice(  ) );

    updateOpservmDMO.setCost( aOpservmDMO.getCost(  ) );

    updateOpservmDMO.setWeight( aOpservmDMO.getWeight(  ) );

    updateOpservmDMO.setUnitGroup( aOpservmDMO.getUnitGroup(  ) );

    updateOpservmDMO.setVatInclusiveFlag( aOpservmDMO.getVatInclusiveFlag(  ) );

    updateOpservmDMO.setUnitQtyPerPrice( aOpservmDMO.getUnitQtyPerPrice(  ) );

    updateOpservmDMO.setVatType( aOpservmDMO.getVatType(  ) );

    updateOpservmDMO.setStageCategory( aOpservmDMO.getStageCategory(  ) );

    //
    // Modify the opservmDMO
    //
    opservmDAC.modify( updateOpservmDMO );

    // Create a new DMO, set keys, and fetch from the database...
    OpservmDMO returnOpservmDMO = new OpservmDMO(  );

    returnOpservmDMO.setProduct( updateOpservmDMO.getProduct(  ) );

    returnOpservmDMO = get( returnOpservmDMO );

    return returnOpservmDMO;
  }

  /**
  * Modifies the Opservm object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param OpservmDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated opservmDMO object.
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
    // Modify the opservmDMO
    //
    opservmDAC.modify( filter );
  }

  /**
   * Deletes the Opservm object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_OPSERVM_003
   *     <li>{@link #Base#OPSERVM_000} if the Opservm does not exist.</li>
   *     <li>{@link #Base#OPSERVM_003} if the Opservm is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param OpservmDMO Opservm object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( OpservmDMO opservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( opservmDMO )" );

    thrower.ifParameterMissing( "opservmDMO", opservmDMO );

    OpservmDMO updateOpservmDMO = null;

    updateOpservmDMO = get( opservmDMO );

    // delete self...
    opservmDAC.delete( opservmDMO );
  }

  /**
   * Deletes the Opservm object.
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
    opservmDAC.delete( filter );
  }

  /**
  * Indicates whether a Opservm exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Opservm exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( OpservmDMO opservmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(opservm)" );

    thrower.ifParameterMissing( "opservmDMO", opservmDMO );

    thrower.ifParameterMissing( "opservmDMO.product",
      opservmDMO.getProduct(  ) );

    return opservmDAC.exists( opservmDMO );
  }

  /**
   * Indicates whether a Opservm exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Opservm exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return opservmDAC.exists( filter );
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

    return opservmDAC.getList( state, filter );
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

    return opservmDAC.iterate( filter );
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

    return opservmDAC.iterateWithLock( filter );
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
  public OpservmDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the OpservmDMO
    //
    OpservmDMO opservmDMO = opservmDAC.get( filter );

    return opservmDMO;
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

    return opservmDAC.max( filter );
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

    return opservmDAC.min( filter );
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

    return new Integer(opservmDAC.count( filter ));
  }
}
