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
 * Defines the individual band (threshold) details for a given rule.
 *
 * This abstract business logic class holds all the logic for the DibDiscountBand class.
 * It is extended by DibDiscountBand class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DibDiscountBandAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DibDiscountBand.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DIBB";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DibDiscountBandDAC dibDiscountBandDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DibDiscountBandDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dibDiscountBandDAC = (DibDiscountBandDAC) dac;
  }

  /**
  * Retrieve a dibDiscountBand data model object from persistent storage. The
  * dibDiscountBandDMO passed in must contain a valid existing dibDiscountBandId.
  * Optionally, the return dibDiscountBandDMO may be include a flag that indicates if
  * the dibDiscountBand object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dibDiscountBand object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIBDISCOUNTBAND_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dibDiscountBandDMO the dibDiscountBand object that must contain either the
  *         unique dibDiscountBandId or the displayCode/languageCode pair
  *
  * @return dibDiscountBandDMO the dibDiscountBand data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DibDiscountBandDMO get( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dibDiscountBandDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dibDiscountBandDMO", dibDiscountBandDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dibDiscountBandDMO.dibBandId",
      dibDiscountBandDMO.getDibBandId(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibRuleId",
      dibDiscountBandDMO.getDibRuleId(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibBandEnd",
      dibDiscountBandDMO.getDibBandEnd(  ) );

    //
    // Attempt to get the DibDiscountBandDMO
    //
    DibDiscountBandDMO returnDibDiscountBandDMO = dibDiscountBandDAC.get( dibDiscountBandDMO );

    //
    // Could not find the DibDiscountBandDMO
    //
    if ( returnDibDiscountBandDMO == null ) {
      thrower.business( Base_DIBDISCOUNTBAND_000,
        new Object[] {
          dibDiscountBandDMO.getDibBandId(  ),
          dibDiscountBandDMO.getDibRuleId(  ),
          dibDiscountBandDMO.getDibBandEnd(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDibDiscountBandDMO;
  }

  /**
   * Return a list of DibDiscountBand objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dibDiscountBands
   * displayCode. If no values have been passed in, all DibDiscountBand objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DibDiscountBand is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dibDiscountBandDMO DibDiscountBandDMO object
   *
   * @return DTOList of DibDiscountBand objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dibDiscountBandDMO )" );

    return dibDiscountBandDAC.getList( state, dibDiscountBandDMO );
  }

  /**
  * Creates the DibDiscountBand object. As a side effect, following creation
  * of a dibDiscountBand an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dibDiscountBandDMO dibDiscountBandDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dibDiscountBandDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DibDiscountBandDMO create( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dibDiscountBandDMO )" );

    thrower.ifParameterMissing( "dibDiscountBandDMO", dibDiscountBandDMO );

    // Set generated key to 0
//    dibDiscountBandDMO.setDibBandId(dibDiscountBandDMO.getDibBandId());
//
//    // Set generated key to 0
//    dibDiscountBandDMO.setDibRuleId(dibDiscountBandDMO.getDibRuleId());
//
//    // Set generated key to 0
//    dibDiscountBandDMO.setDibBandEnd(dibDiscountBandDMO.getDibBandEnd());

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibDiscType",
      dibDiscountBandDMO.getDibDiscType(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibDiscValue",
      dibDiscountBandDMO.getDibDiscValue(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibLimitDisc",
      dibDiscountBandDMO.getDibLimitDisc(  ) );

    //
    // Now create the dibDiscountBand
    //
    dibDiscountBandDMO = dibDiscountBandDAC.create( dibDiscountBandDMO );

    return dibDiscountBandDMO;
  }

  /**
  * Modifies the DibDiscountBand object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DIBDISCOUNTBAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dibDiscountBandDMO dibDiscountBandDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dibDiscountBandDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DibDiscountBandDMO modify( DibDiscountBandDMO aDibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adibDiscountBandDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adibDiscountBandDMO", aDibDiscountBandDMO );

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibBandId",
      aDibDiscountBandDMO.getDibBandId(  ) ); // attribute

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibRuleId",
      aDibDiscountBandDMO.getDibRuleId(  ) ); // attribute

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibBandEnd",
      aDibDiscountBandDMO.getDibBandEnd(  ) ); // attribute

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibDiscType",
      aDibDiscountBandDMO.getDibDiscType(  ) ); // attribute

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibDiscValue",
      aDibDiscountBandDMO.getDibDiscValue(  ) ); // attribute

    thrower.ifParameterMissing( "aDibDiscountBandDMO.dibLimitDisc",
      aDibDiscountBandDMO.getDibLimitDisc(  ) ); // attribute

    DibDiscountBandDMO updateDibDiscountBandDMO = new DibDiscountBandDMO(  );

    updateDibDiscountBandDMO.setDibBandId( aDibDiscountBandDMO.getDibBandId(  ) );

    updateDibDiscountBandDMO.setDibRuleId( aDibDiscountBandDMO.getDibRuleId(  ) );

    updateDibDiscountBandDMO.setDibBandEnd( aDibDiscountBandDMO.getDibBandEnd(  ) );

    updateDibDiscountBandDMO = get( updateDibDiscountBandDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDibDiscountBandDMO.setDibDiscType( aDibDiscountBandDMO
      .getDibDiscType(  ) );

    updateDibDiscountBandDMO.setDibDiscValue( aDibDiscountBandDMO
      .getDibDiscValue(  ) );

    updateDibDiscountBandDMO.setDibMaxDiscount( aDibDiscountBandDMO
      .getDibMaxDiscount(  ) );

    updateDibDiscountBandDMO.setDibLimitDisc( aDibDiscountBandDMO
      .getDibLimitDisc(  ) );

    updateDibDiscountBandDMO.setDibChargeRef( aDibDiscountBandDMO
      .getDibChargeRef(  ) );

    //
    // Modify the dibDiscountBandDMO
    //
    dibDiscountBandDAC.modify( updateDibDiscountBandDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DibDiscountBandDMO returnDibDiscountBandDMO = new DibDiscountBandDMO(  );

    returnDibDiscountBandDMO.setDibBandId( updateDibDiscountBandDMO
      .getDibBandId(  ) );

    returnDibDiscountBandDMO.setDibRuleId( updateDibDiscountBandDMO
      .getDibRuleId(  ) );

    returnDibDiscountBandDMO.setDibBandEnd( updateDibDiscountBandDMO
      .getDibBandEnd(  ) );

    returnDibDiscountBandDMO = get( returnDibDiscountBandDMO );

    return returnDibDiscountBandDMO;
  }

  /**
  * Modifies the DibDiscountBand object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DibDiscountBandDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dibDiscountBandDMO object.
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
    // Modify the dibDiscountBandDMO
    //
    dibDiscountBandDAC.modify( filter );
  }

  /**
   * Deletes the DibDiscountBand object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DIBDISCOUNTBAND_003
   *     <li>{@link #Base#DIBDISCOUNTBAND_000} if the DibDiscountBand does not exist.</li>
   *     <li>{@link #Base#DIBDISCOUNTBAND_003} if the DibDiscountBand is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DibDiscountBandDMO DibDiscountBand object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dibDiscountBandDMO )" );

    thrower.ifParameterMissing( "dibDiscountBandDMO", dibDiscountBandDMO );

    DibDiscountBandDMO updateDibDiscountBandDMO = null;

    updateDibDiscountBandDMO = get( dibDiscountBandDMO );

    // delete self...
    dibDiscountBandDAC.delete( dibDiscountBandDMO );
  }

  /**
   * Deletes the DibDiscountBand object.
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
    dibDiscountBandDAC.delete( filter );
  }

  /**
  * Indicates whether a DibDiscountBand exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DibDiscountBand exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dibDiscountBand)" );

    thrower.ifParameterMissing( "dibDiscountBandDMO", dibDiscountBandDMO );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibBandId",
      dibDiscountBandDMO.getDibBandId(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibRuleId",
      dibDiscountBandDMO.getDibRuleId(  ) );

    thrower.ifParameterMissing( "dibDiscountBandDMO.dibBandEnd",
      dibDiscountBandDMO.getDibBandEnd(  ) );

    return dibDiscountBandDAC.exists( dibDiscountBandDMO );
  }

  /**
   * Indicates whether a DibDiscountBand exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DibDiscountBand exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dibDiscountBandDAC.exists( filter );
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

    return dibDiscountBandDAC.getList( state, filter );
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

    return dibDiscountBandDAC.iterate( filter );
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

    return dibDiscountBandDAC.iterateWithLock( filter );
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
  public DibDiscountBandDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DibDiscountBandDMO
    //
    DibDiscountBandDMO dibDiscountBandDMO = dibDiscountBandDAC.get( filter );

    return dibDiscountBandDMO;
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

    return dibDiscountBandDAC.max( filter );
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

    return dibDiscountBandDAC.min( filter );
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

    return new Integer(dibDiscountBandDAC.count( filter));
  }
}
