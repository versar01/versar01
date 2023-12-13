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
 * Associating packages, tariffs and services.
 * <p>
 *   The TS_TARIFF_SERVICE table holds the charges applicable to a service on a specific tariff.
 * </p>
 *
 * This abstract business logic class holds all the logic for the TsTariffService class.
 * It is extended by TsTariffService class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class TsTariffServiceAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( TsTariffService.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "TSTS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected TsTariffServiceDAC tsTariffServiceDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return TsTariffServiceDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.tsTariffServiceDAC = (TsTariffServiceDAC) dac;
  }

  /**
  * Retrieve a tsTariffService data model object from persistent storage. The
  * tsTariffServiceDMO passed in must contain a valid existing tsTariffServiceId.
  * Optionally, the return tsTariffServiceDMO may be include a flag that indicates if
  * the tsTariffService object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the tsTariffService object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TSTARIFFSERVICE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  tsTariffServiceDMO the tsTariffService object that must contain either the
  *         unique tsTariffServiceId or the displayCode/languageCode pair
  *
  * @return tsTariffServiceDMO the tsTariffService data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public TsTariffServiceDMO get( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(tsTariffServiceDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "tsTariffServiceDMO", tsTariffServiceDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "tsTariffServiceDMO.tsPackageCode",
      tsTariffServiceDMO.getTsPackageCode(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsInternalTariff",
      tsTariffServiceDMO.getTsInternalTariff(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsServiceCode",
      tsTariffServiceDMO.getTsServiceCode(  ) );

    //
    // Attempt to get the TsTariffServiceDMO
    //
    TsTariffServiceDMO returnTsTariffServiceDMO = tsTariffServiceDAC.get( tsTariffServiceDMO );

    //
    // Could not find the TsTariffServiceDMO
    //
    if ( returnTsTariffServiceDMO == null ) {
      thrower.business( Base_TSTARIFFSERVICE_000,
        new Object[] {
          tsTariffServiceDMO.getTsPackageCode(  ),
          tsTariffServiceDMO.getTsInternalTariff(  ),
          tsTariffServiceDMO.getTsServiceCode(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnTsTariffServiceDMO;
  }

  /**
   * Return a list of TsTariffService objects matching the passed in values. A
   * partial match is performed on the description argument and/or the tsTariffServices
   * displayCode. If no values have been passed in, all TsTariffService objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the TsTariffService is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param tsTariffServiceDMO TsTariffServiceDMO object
   *
   * @return DTOList of TsTariffService objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, tsTariffServiceDMO )" );

    return tsTariffServiceDAC.getList( state, tsTariffServiceDMO );
  }

  /**
  * Creates the TsTariffService object. As a side effect, following creation
  * of a tsTariffService an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param tsTariffServiceDMO tsTariffServiceDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tsTariffServiceDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TsTariffServiceDMO create( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( tsTariffServiceDMO )" );

    thrower.ifParameterMissing( "tsTariffServiceDMO", tsTariffServiceDMO );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsPackageCode",
      tsTariffServiceDMO.getTsPackageCode(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsInternalTariff",
      tsTariffServiceDMO.getTsInternalTariff(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsServiceCode",
      tsTariffServiceDMO.getTsServiceCode(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsChargePeriod",
      tsTariffServiceDMO.getTsChargePeriod(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsChargeFreq",
      tsTariffServiceDMO.getTsChargeFreq(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( tsTariffServiceDMO ) ) {
      thrower.business( Base_TSTARIFFSERVICE_001,
        new Object[] {
          tsTariffServiceDMO.getTsPackageCode(  ),
          tsTariffServiceDMO.getTsInternalTariff(  ),
          tsTariffServiceDMO.getTsServiceCode(  )
        } );
    }

    //
    // Now create the tsTariffService
    //
    tsTariffServiceDAC.create( tsTariffServiceDMO );

    return tsTariffServiceDMO;
  }

  /**
  * Modifies the TsTariffService object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TSTARIFFSERVICE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param tsTariffServiceDMO tsTariffServiceDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tsTariffServiceDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TsTariffServiceDMO modify( TsTariffServiceDMO aTsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( atsTariffServiceDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "atsTariffServiceDMO", aTsTariffServiceDMO );

    thrower.ifParameterMissing( "aTsTariffServiceDMO.tsPackageCode",
      aTsTariffServiceDMO.getTsPackageCode(  ) ); // attribute

    thrower.ifParameterMissing( "aTsTariffServiceDMO.tsInternalTariff",
      aTsTariffServiceDMO.getTsInternalTariff(  ) ); // attribute

    thrower.ifParameterMissing( "aTsTariffServiceDMO.tsServiceCode",
      aTsTariffServiceDMO.getTsServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aTsTariffServiceDMO.tsChargePeriod",
      aTsTariffServiceDMO.getTsChargePeriod(  ) ); // attribute

    thrower.ifParameterMissing( "aTsTariffServiceDMO.tsChargeFreq",
      aTsTariffServiceDMO.getTsChargeFreq(  ) ); // attribute

    TsTariffServiceDMO updateTsTariffServiceDMO = new TsTariffServiceDMO(  );

    updateTsTariffServiceDMO.setTsPackageCode( aTsTariffServiceDMO
      .getTsPackageCode(  ) );

    updateTsTariffServiceDMO.setTsInternalTariff( aTsTariffServiceDMO
      .getTsInternalTariff(  ) );

    updateTsTariffServiceDMO.setTsServiceCode( aTsTariffServiceDMO
      .getTsServiceCode(  ) );

    updateTsTariffServiceDMO = get( updateTsTariffServiceDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateTsTariffServiceDMO.setTsNetServCode( aTsTariffServiceDMO
      .getTsNetServCode(  ) );

    updateTsTariffServiceDMO.setTsActCharge( aTsTariffServiceDMO
      .getTsActCharge(  ) );

    updateTsTariffServiceDMO.setTsTdeactCharge( aTsTariffServiceDMO
      .getTsTdeactCharge(  ) );

    updateTsTariffServiceDMO.setTsReactCharge( aTsTariffServiceDMO
      .getTsReactCharge(  ) );

    updateTsTariffServiceDMO.setTsPdeactCharge( aTsTariffServiceDMO
      .getTsPdeactCharge(  ) );

    updateTsTariffServiceDMO.setTsSubCharge1( aTsTariffServiceDMO
      .getTsSubCharge1(  ) );

    updateTsTariffServiceDMO.setTsSubCharge2( aTsTariffServiceDMO
      .getTsSubCharge2(  ) );

    updateTsTariffServiceDMO.setTsSubCharge3( aTsTariffServiceDMO
      .getTsSubCharge3(  ) );

    updateTsTariffServiceDMO.setTsChargePeriod( aTsTariffServiceDMO
      .getTsChargePeriod(  ) );

    updateTsTariffServiceDMO.setTsChargeFreq( aTsTariffServiceDMO
      .getTsChargeFreq(  ) );

    updateTsTariffServiceDMO.setTsDiscountRef( aTsTariffServiceDMO
      .getTsDiscountRef(  ) );

    updateTsTariffServiceDMO.setTsActInclusive( aTsTariffServiceDMO
      .getTsActInclusive(  ) );

    //
    // Modify the tsTariffServiceDMO
    //
    tsTariffServiceDAC.modify( updateTsTariffServiceDMO );

    // Create a new DMO, set keys, and fetch from the database...
    TsTariffServiceDMO returnTsTariffServiceDMO = new TsTariffServiceDMO(  );

    returnTsTariffServiceDMO.setTsPackageCode( updateTsTariffServiceDMO
      .getTsPackageCode(  ) );

    returnTsTariffServiceDMO.setTsInternalTariff( updateTsTariffServiceDMO
      .getTsInternalTariff(  ) );

    returnTsTariffServiceDMO.setTsServiceCode( updateTsTariffServiceDMO
      .getTsServiceCode(  ) );

    returnTsTariffServiceDMO = get( returnTsTariffServiceDMO );

    return returnTsTariffServiceDMO;
  }

  /**
  * Modifies the TsTariffService object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param TsTariffServiceDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tsTariffServiceDMO object.
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
    // Modify the tsTariffServiceDMO
    //
    tsTariffServiceDAC.modify( filter );
  }

  /**
   * Deletes the TsTariffService object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_TSTARIFFSERVICE_003
   *     <li>{@link #Base#TSTARIFFSERVICE_000} if the TsTariffService does not exist.</li>
   *     <li>{@link #Base#TSTARIFFSERVICE_003} if the TsTariffService is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param TsTariffServiceDMO TsTariffService object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( tsTariffServiceDMO )" );

    thrower.ifParameterMissing( "tsTariffServiceDMO", tsTariffServiceDMO );

    TsTariffServiceDMO updateTsTariffServiceDMO = null;

    updateTsTariffServiceDMO = get( tsTariffServiceDMO );

    // delete self...
    tsTariffServiceDAC.delete( tsTariffServiceDMO );
  }

  /**
   * Deletes the TsTariffService object.
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
    tsTariffServiceDAC.delete( filter );
  }

  /**
  * Indicates whether a TsTariffService exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the TsTariffService exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(tsTariffService)" );

    thrower.ifParameterMissing( "tsTariffServiceDMO", tsTariffServiceDMO );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsPackageCode",
      tsTariffServiceDMO.getTsPackageCode(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsInternalTariff",
      tsTariffServiceDMO.getTsInternalTariff(  ) );

    thrower.ifParameterMissing( "tsTariffServiceDMO.tsServiceCode",
      tsTariffServiceDMO.getTsServiceCode(  ) );

    return tsTariffServiceDAC.exists( tsTariffServiceDMO );
  }

  /**
   * Indicates whether a TsTariffService exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the TsTariffService exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return tsTariffServiceDAC.exists( filter );
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

    return tsTariffServiceDAC.getList( state, filter );
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

    return tsTariffServiceDAC.iterate( filter );
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

    return tsTariffServiceDAC.iterateWithLock( filter );
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
  public TsTariffServiceDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the TsTariffServiceDMO
    //
    TsTariffServiceDMO tsTariffServiceDMO = tsTariffServiceDAC.get( filter );

    return tsTariffServiceDMO;
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

    return tsTariffServiceDAC.max( filter );
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

    return tsTariffServiceDAC.min( filter );
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

    return new Integer(tsTariffServiceDAC.count( filter ));
  }
}
