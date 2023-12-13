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
 * Defines a group of calculations that make up a discount.
 * <p>
 *   This is the master record where the name of the discount is defined.
 * </p>
 * <p>
 *   When discounts are granted it is one of these named groups of calculation rules that actually gets granted.
 * </p>
 * <p>
 *   The individual calculation rules are defined in dir_discount_rule.
 * </p>
 *
 * This abstract business logic class holds all the logic for the DisDiscount class.
 * It is extended by DisDiscount class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DisDiscountAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DisDiscount.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DIS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DisDiscountDAC disDiscountDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DisDiscountDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.disDiscountDAC = (DisDiscountDAC) dac;
  }

  /**
  * Retrieve a disDiscount data model object from persistent storage. The
  * disDiscountDMO passed in must contain a valid existing disDiscountId.
  * Optionally, the return disDiscountDMO may be include a flag that indicates if
  * the disDiscount object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the disDiscount object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DISDISCOUNT_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  disDiscountDMO the disDiscount object that must contain either the
  *         unique disDiscountId or the displayCode/languageCode pair
  *
  * @return disDiscountDMO the disDiscount data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DisDiscountDMO get( DisDiscountDMO disDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(disDiscountDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "disDiscountDMO", disDiscountDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "disDiscountDMO.disDiscountId",
      disDiscountDMO.getDisDiscountId(  ) );

    //
    // Attempt to get the DisDiscountDMO
    //
    DisDiscountDMO returnDisDiscountDMO = disDiscountDAC.get( disDiscountDMO );

    //
    // Could not find the DisDiscountDMO
    //
    if ( returnDisDiscountDMO == null ) {
      thrower.business( Base_DISDISCOUNT_000,
        new Object[] { disDiscountDMO.getDisDiscountId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDisDiscountDMO;
  }

  /**
   * Return a list of DisDiscount objects matching the passed in values. A
   * partial match is performed on the description argument and/or the disDiscounts
   * displayCode. If no values have been passed in, all DisDiscount objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DisDiscount is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param disDiscountDMO DisDiscountDMO object
   *
   * @return DTOList of DisDiscount objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState   state,
    DisDiscountDMO disDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, disDiscountDMO )" );

    return disDiscountDAC.getList( state, disDiscountDMO );
  }

  /**
  * Creates the DisDiscount object. As a side effect, following creation
  * of a disDiscount an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param disDiscountDMO disDiscountDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated disDiscountDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DisDiscountDMO create( DisDiscountDMO disDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( disDiscountDMO )" );

    thrower.ifParameterMissing( "disDiscountDMO", disDiscountDMO );

    // Set generated key to 0
    disDiscountDMO.setDisDiscountId(new Integer(0));

    thrower.ifParameterMissing( "disDiscountDMO.disDiscountRef",
      disDiscountDMO.getDisDiscountRef(  ) );

    thrower.ifParameterMissing( "disDiscountDMO.disDiscountDesc",
      disDiscountDMO.getDisDiscountDesc(  ) );

    //
    // Now create the disDiscount
    //
    disDiscountDMO = disDiscountDAC.create( disDiscountDMO );

    return disDiscountDMO;
  }

  /**
  * Modifies the DisDiscount object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DISDISCOUNT_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param disDiscountDMO disDiscountDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated disDiscountDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DisDiscountDMO modify( DisDiscountDMO aDisDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adisDiscountDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adisDiscountDMO", aDisDiscountDMO );

    thrower.ifParameterMissing( "aDisDiscountDMO.disDiscountId",
      aDisDiscountDMO.getDisDiscountId(  ) ); // attribute

    thrower.ifParameterMissing( "aDisDiscountDMO.disDiscountRef",
      aDisDiscountDMO.getDisDiscountRef(  ) ); // attribute

    thrower.ifParameterMissing( "aDisDiscountDMO.disDiscountDesc",
      aDisDiscountDMO.getDisDiscountDesc(  ) ); // attribute

    DisDiscountDMO updateDisDiscountDMO = new DisDiscountDMO(  );

    updateDisDiscountDMO.setDisDiscountId( aDisDiscountDMO.getDisDiscountId(  ) );

    updateDisDiscountDMO = get( updateDisDiscountDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDisDiscountDMO.setDisDiscountRef( aDisDiscountDMO.getDisDiscountRef(  ) );

    updateDisDiscountDMO.setDisDiscountDesc( aDisDiscountDMO
      .getDisDiscountDesc(  ) );

    //
    // Modify the disDiscountDMO
    //
    disDiscountDAC.modify( updateDisDiscountDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DisDiscountDMO returnDisDiscountDMO = new DisDiscountDMO(  );

    returnDisDiscountDMO.setDisDiscountId( updateDisDiscountDMO
      .getDisDiscountId(  ) );

    returnDisDiscountDMO = get( returnDisDiscountDMO );

    return returnDisDiscountDMO;
  }

  /**
  * Modifies the DisDiscount object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DisDiscountDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated disDiscountDMO object.
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
    // Modify the disDiscountDMO
    //
    disDiscountDAC.modify( filter );
  }

  /**
   * Deletes the DisDiscount object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DISDISCOUNT_003
   *     <li>{@link #Base#DISDISCOUNT_000} if the DisDiscount does not exist.</li>
   *     <li>{@link #Base#DISDISCOUNT_003} if the DisDiscount is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DisDiscountDMO DisDiscount object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DisDiscountDMO disDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( disDiscountDMO )" );

    thrower.ifParameterMissing( "disDiscountDMO", disDiscountDMO );

    DisDiscountDMO updateDisDiscountDMO = null;

    updateDisDiscountDMO = get( disDiscountDMO );

    // delete self...
    disDiscountDAC.delete( disDiscountDMO );
  }

  /**
   * Deletes the DisDiscount object.
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
    disDiscountDAC.delete( filter );
  }

  /**
  * Indicates whether a DisDiscount exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DisDiscount exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DisDiscountDMO disDiscountDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(disDiscount)" );

    thrower.ifParameterMissing( "disDiscountDMO", disDiscountDMO );

    thrower.ifParameterMissing( "disDiscountDMO.disDiscountId",
      disDiscountDMO.getDisDiscountId(  ) );

    return disDiscountDAC.exists( disDiscountDMO );
  }

  /**
   * Indicates whether a DisDiscount exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DisDiscount exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return disDiscountDAC.exists( filter );
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

    return disDiscountDAC.getList( state, filter );
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

    return disDiscountDAC.iterate( filter );
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

    return disDiscountDAC.iterateWithLock( filter );
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
  public DisDiscountDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DisDiscountDMO
    //
    DisDiscountDMO disDiscountDMO = disDiscountDAC.get( filter );

    return disDiscountDMO;
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

    return disDiscountDAC.max( filter );
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

    return disDiscountDAC.min( filter );
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

    return new Integer(disDiscountDAC.count( filter ));
  }
}
