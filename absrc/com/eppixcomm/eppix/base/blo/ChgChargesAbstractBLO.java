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
 * Each entry defines a charge code giving it a price and a description.
 * <p>
 *   Whenever a charge is to be made the user can select from this list.
 * </p>
 * <p>
 *   There is only the slight minor change to this table in this version: the netid can take any id defined in vpr_provider_id on
 *   the vpr_provider table.
 * </p>
 *
 * This abstract business logic class holds all the logic for the ChgCharges class.
 * It is extended by ChgCharges class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class ChgChargesAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  public static Thrower thrower = Thrower.getThrower( ChgCharges.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CHG";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected ChgChargesDAC chgChargesDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return ChgChargesDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.chgChargesDAC = (ChgChargesDAC) dac;
  }

  /**
  * Retrieve a chgCharges data model object from persistent storage. The
  * chgChargesDMO passed in must contain a valid existing chgChargesId.
  * Optionally, the return chgChargesDMO may be include a flag that indicates if
  * the chgCharges object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the chgCharges object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CHGCHARGES_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  chgChargesDMO the chgCharges object that must contain either the
  *         unique chgChargesId or the displayCode/languageCode pair
  *
  * @return chgChargesDMO the chgCharges data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public ChgChargesDMO get( ChgChargesDMO chgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(chgChargesDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "chgChargesDMO", chgChargesDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "chgChargesDMO.chgCode",
      chgChargesDMO.getChgCode(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgNetid",
      chgChargesDMO.getChgNetid(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgEffectiveDate",
      chgChargesDMO.getChgEffectiveDate(  ) );

    //
    // Attempt to get the ChgChargesDMO
    //
    ChgChargesDMO returnChgChargesDMO = chgChargesDAC.get( chgChargesDMO );

    //
    // Could not find the ChgChargesDMO
    //
    if ( returnChgChargesDMO == null ) {
      thrower.business( Base_CHGCHARGES_000,
        new Object[] {
          chgChargesDMO.getChgCode(  ), chgChargesDMO.getChgNetid(  ),
          chgChargesDMO.getChgEffectiveDate(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnChgChargesDMO;
  }

  /**
   * Return a list of ChgCharges objects matching the passed in values. A
   * partial match is performed on the description argument and/or the chgChargess
   * displayCode. If no values have been passed in, all ChgCharges objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the ChgCharges is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param chgChargesDMO ChgChargesDMO object
   *
   * @return DTOList of ChgCharges objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState  state,
    ChgChargesDMO chgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, chgChargesDMO )" );

    return chgChargesDAC.getList( state, chgChargesDMO );
  }

  /**
  * Creates the ChgCharges object. As a side effect, following creation
  * of a chgCharges an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param chgChargesDMO chgChargesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated chgChargesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public ChgChargesDMO create( ChgChargesDMO chgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( chgChargesDMO )" );

    thrower.ifParameterMissing( "chgChargesDMO", chgChargesDMO );

    thrower.ifParameterMissing( "chgChargesDMO.chgCode",
      chgChargesDMO.getChgCode(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgNetid",
      chgChargesDMO.getChgNetid(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgEffectiveDate",
      chgChargesDMO.getChgEffectiveDate(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgClassId",
      chgChargesDMO.getChgClassId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( chgChargesDMO ) ) {
      thrower.business( Base_CHGCHARGES_001,
        new Object[] {
          chgChargesDMO.getChgCode(  ), chgChargesDMO.getChgNetid(  ),
          chgChargesDMO.getChgEffectiveDate(  )
        } );
    }

    //
    // Now create the chgCharges
    //
    chgChargesDAC.create( chgChargesDMO );

    return chgChargesDMO;
  }

  /**
  * Modifies the ChgCharges object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CHGCHARGES_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param chgChargesDMO chgChargesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated chgChargesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public ChgChargesDMO modify( ChgChargesDMO aChgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( achgChargesDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "achgChargesDMO", aChgChargesDMO );

    thrower.ifParameterMissing( "aChgChargesDMO.chgCode",
      aChgChargesDMO.getChgCode(  ) ); // attribute

    thrower.ifParameterMissing( "aChgChargesDMO.chgNetid",
      aChgChargesDMO.getChgNetid(  ) ); // attribute

    thrower.ifParameterMissing( "aChgChargesDMO.chgEffectiveDate",
      aChgChargesDMO.getChgEffectiveDate(  ) ); // attribute

    thrower.ifParameterMissing( "aChgChargesDMO.chgClassId",
      aChgChargesDMO.getChgClassId(  ) ); // attribute

    ChgChargesDMO updateChgChargesDMO = new ChgChargesDMO(  );

    updateChgChargesDMO.setChgCode( aChgChargesDMO.getChgCode(  ) );

    updateChgChargesDMO.setChgNetid( aChgChargesDMO.getChgNetid(  ) );

    updateChgChargesDMO.setChgEffectiveDate( aChgChargesDMO
      .getChgEffectiveDate(  ) );

    updateChgChargesDMO = get( updateChgChargesDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateChgChargesDMO.setChgDescription( aChgChargesDMO.getChgDescription(  ) );

    updateChgChargesDMO.setChgValue( aChgChargesDMO.getChgValue(  ) );

    updateChgChargesDMO.setChgVatCode( aChgChargesDMO.getChgVatCode(  ) );

    updateChgChargesDMO.setChgNcode( aChgChargesDMO.getChgNcode(  ) );

    updateChgChargesDMO.setChgChargef( aChgChargesDMO.getChgChargef(  ) );

    updateChgChargesDMO.setChgPeriod( aChgChargesDMO.getChgPeriod(  ) );

    updateChgChargesDMO.setChgFrequency( aChgChargesDMO.getChgFrequency(  ) );

    updateChgChargesDMO.setChgClassId( aChgChargesDMO.getChgClassId(  ) );

    //
    // Modify the chgChargesDMO
    //
    chgChargesDAC.modify( updateChgChargesDMO );

    // Create a new DMO, set keys, and fetch from the database...
    ChgChargesDMO returnChgChargesDMO = new ChgChargesDMO(  );

    returnChgChargesDMO.setChgCode( updateChgChargesDMO.getChgCode(  ) );

    returnChgChargesDMO.setChgNetid( updateChgChargesDMO.getChgNetid(  ) );

    returnChgChargesDMO.setChgEffectiveDate( updateChgChargesDMO
      .getChgEffectiveDate(  ) );

    returnChgChargesDMO = get( returnChgChargesDMO );

    return returnChgChargesDMO;
  }

  /**
  * Modifies the ChgCharges object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ChgChargesDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated chgChargesDMO object.
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
    // Modify the chgChargesDMO
    //
    chgChargesDAC.modify( filter );
  }

  /**
   * Deletes the ChgCharges object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_CHGCHARGES_003
   *     <li>{@link #Base#CHGCHARGES_000} if the ChgCharges does not exist.</li>
   *     <li>{@link #Base#CHGCHARGES_003} if the ChgCharges is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param ChgChargesDMO ChgCharges object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( ChgChargesDMO chgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( chgChargesDMO )" );

    thrower.ifParameterMissing( "chgChargesDMO", chgChargesDMO );

    ChgChargesDMO updateChgChargesDMO = null;

    updateChgChargesDMO = get( chgChargesDMO );

    // delete self...
    chgChargesDAC.delete( chgChargesDMO );
  }

  /**
   * Deletes the ChgCharges object.
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
    chgChargesDAC.delete( filter );
  }

  /**
  * Indicates whether a ChgCharges exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the ChgCharges exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( ChgChargesDMO chgChargesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(chgCharges)" );

    thrower.ifParameterMissing( "chgChargesDMO", chgChargesDMO );

    thrower.ifParameterMissing( "chgChargesDMO.chgCode",
      chgChargesDMO.getChgCode(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgNetid",
      chgChargesDMO.getChgNetid(  ) );

    thrower.ifParameterMissing( "chgChargesDMO.chgEffectiveDate",
      chgChargesDMO.getChgEffectiveDate(  ) );

    return chgChargesDAC.exists( chgChargesDMO );
  }

  /**
   * Indicates whether a ChgCharges exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the ChgCharges exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return chgChargesDAC.exists( filter );
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

    return chgChargesDAC.getList( state, filter );
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

    return chgChargesDAC.iterate( filter );
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

    return chgChargesDAC.iterateWithLock( filter );
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
  public ChgChargesDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the ChgChargesDMO
    //
    ChgChargesDMO chgChargesDMO = chgChargesDAC.get( filter );

    return chgChargesDMO;
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

    return chgChargesDAC.max( filter );
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

    return chgChargesDAC.min( filter );
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

    return new Integer(chgChargesDAC.count( filter ));
  }
}
