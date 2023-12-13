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
 * Used for Subscriber Upgrade.
 * <p>
 *   Little used piece of functionality.
 * </p>
 *
 * This abstract business logic class holds all the logic for the SbuSubUpgrade class.
 * It is extended by SbuSubUpgrade class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SbuSubUpgradeAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SbuSubUpgradeAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SBUU";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  public SbuSubUpgradeDAC sbuSubUpgradeDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  public void setDAC( DAC dac ) {
    this.sbuSubUpgradeDAC = (SbuSubUpgradeDAC) dac;
  }

  /**
   * Return a list of SbuSubUpgrade objects matching the passed in values. A
   * partial match is performed on the description argument and/or the sbuSubUpgrades
   * displayCode. If no values have been passed in, all SbuSubUpgrade objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SbuSubUpgrade is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param sbuSubUpgradeDMO SbuSubUpgradeDMO object
   *
   * @return DTOList of SbuSubUpgrade objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<SbuSubUpgradeDMO> getList( 
//    DTOListState     state,
//    SbuSubUpgradeDMO sbuSubUpgradeDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, sbuSubUpgradeDMO )" );
//
//    return sbuSubUpgradeDAC.getList( state, sbuSubUpgradeDMO );
//  }

  /**
  * Creates the SbuSubUpgrade object. As a side effect, following creation
  * of a sbuSubUpgrade an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sbuSubUpgradeDMO sbuSubUpgradeDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sbuSubUpgradeDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SbuSubUpgradeDMO create( SbuSubUpgradeDMO sbuSubUpgradeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( sbuSubUpgradeDMO )" );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO", sbuSubUpgradeDMO );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuSubupgradeId",
      sbuSubUpgradeDMO.getSbuSubupgradeId(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuSubscriberId",
      sbuSubUpgradeDMO.getSbuSubscriberId(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuUpgradeQual",
      sbuSubUpgradeDMO.getSbuUpgradeQual(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuAccountStatus",
      sbuSubUpgradeDMO.getSbuAccountStatus(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuMtnStatus",
      sbuSubUpgradeDMO.getSbuMtnStatus(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuCustomerType",
      sbuSubUpgradeDMO.getSbuCustomerType(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuTariffCode",
      sbuSubUpgradeDMO.getSbuTariffCode(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuPackageCode",
      sbuSubUpgradeDMO.getSbuPackageCode(  ) );

    thrower.ifParameterMissing( "sbuSubUpgradeDMO.sbuUpgradeStatus",
      sbuSubUpgradeDMO.getSbuUpgradeStatus(  ) );

    //
    // Now create the sbuSubUpgrade
    //
    sbuSubUpgradeDAC.create( sbuSubUpgradeDMO );

    return sbuSubUpgradeDMO;
  }

  /**
  * Modifies the SbuSubUpgrade object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SbuSubUpgradeDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sbuSubUpgradeDMO object.
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
    // Modify the sbuSubUpgradeDMO
    //
    sbuSubUpgradeDAC.modify( filter );
  }

  /**
   * Deletes the SbuSubUpgrade object.
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
    sbuSubUpgradeDAC.delete( filter );
  }

  /**
   * Indicates whether a SbuSubUpgrade exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SbuSubUpgrade exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return sbuSubUpgradeDAC.exists( filter );
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
//  public DTOList<SbuSubUpgradeDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return sbuSubUpgradeDAC.getList( state, filter );
//  }

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

    return sbuSubUpgradeDAC.iterate( filter );
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

    return sbuSubUpgradeDAC.iterateWithLock( filter );
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
  public SbuSubUpgradeDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SbuSubUpgradeDMO
    //
    SbuSubUpgradeDMO sbuSubUpgradeDMO = sbuSubUpgradeDAC.get( filter );

    return sbuSubUpgradeDMO;
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

    return sbuSubUpgradeDAC.max( filter );
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

    return sbuSubUpgradeDAC.min( filter );
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

    return Integer.valueOf(sbuSubUpgradeDAC.count( filter ));
  }
}
