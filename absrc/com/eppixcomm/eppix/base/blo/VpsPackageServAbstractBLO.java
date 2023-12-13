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
 * Lists the services that are available on a the packages the user has defined.
 * <p>
 *   One entry for each service on each package.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VpsPackageServ class.
 * It is extended by VpsPackageServ class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VpsPackageServAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VpsPackageServ.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VPSS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VpsPackageServDAC vpsPackageServDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VpsPackageServDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vpsPackageServDAC = (VpsPackageServDAC) dac;
  }

  /**
  * Retrieve a vpsPackageServ data model object from persistent storage. The
  * vpsPackageServDMO passed in must contain a valid existing vpsPackageServId.
  * Optionally, the return vpsPackageServDMO may be include a flag that indicates if
  * the vpsPackageServ object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vpsPackageServ object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPSPACKAGESERV_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vpsPackageServDMO the vpsPackageServ object that must contain either the
  *         unique vpsPackageServId or the displayCode/languageCode pair
  *
  * @return vpsPackageServDMO the vpsPackageServ data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VpsPackageServDMO get( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vpsPackageServDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vpsPackageServDMO", vpsPackageServDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vpsPackageServDMO.vpsPackageCode",
      vpsPackageServDMO.getVpsPackageCode(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsServiceCode",
      vpsPackageServDMO.getVpsServiceCode(  ) );

    //
    // Attempt to get the VpsPackageServDMO
    //
    VpsPackageServDMO returnVpsPackageServDMO = vpsPackageServDAC.get( vpsPackageServDMO );

    //
    // Could not find the VpsPackageServDMO
    //
    if ( returnVpsPackageServDMO == null ) {
      thrower.business( Base_VPSPACKAGESERV_000,
        new Object[] {
          vpsPackageServDMO.getVpsPackageCode(  ),
          vpsPackageServDMO.getVpsServiceCode(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVpsPackageServDMO;
  }

  /**
   * Return a list of VpsPackageServ objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vpsPackageServs
   * displayCode. If no values have been passed in, all VpsPackageServ objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VpsPackageServ is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vpsPackageServDMO VpsPackageServDMO object
   *
   * @return DTOList of VpsPackageServ objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState      state,
    VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vpsPackageServDMO )" );

    return vpsPackageServDAC.getList( state, vpsPackageServDMO );
  }

  /**
  * Creates the VpsPackageServ object. As a side effect, following creation
  * of a vpsPackageServ an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpsPackageServDMO vpsPackageServDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpsPackageServDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpsPackageServDMO create( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vpsPackageServDMO )" );

    thrower.ifParameterMissing( "vpsPackageServDMO", vpsPackageServDMO );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsPackageCode",
      vpsPackageServDMO.getVpsPackageCode(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsServiceCode",
      vpsPackageServDMO.getVpsServiceCode(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsAlterCharge",
      vpsPackageServDMO.getVpsAlterCharge(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsMultiCharge",
      vpsPackageServDMO.getVpsMultiCharge(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsChangeMulti",
      vpsPackageServDMO.getVpsChangeMulti(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsPriceByTarif",
      vpsPackageServDMO.getVpsPriceByTarif(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsAutoConnect",
      vpsPackageServDMO.getVpsAutoConnect(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vpsPackageServDMO ) ) {
      thrower.business( Base_VPSPACKAGESERV_001,
        new Object[] {
          vpsPackageServDMO.getVpsPackageCode(  ),
          vpsPackageServDMO.getVpsServiceCode(  )
        } );
    }

    //
    // Now create the vpsPackageServ
    //
    vpsPackageServDAC.create( vpsPackageServDMO );

    return vpsPackageServDMO;
  }

  /**
  * Modifies the VpsPackageServ object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPSPACKAGESERV_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpsPackageServDMO vpsPackageServDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpsPackageServDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpsPackageServDMO modify( VpsPackageServDMO aVpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avpsPackageServDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avpsPackageServDMO", aVpsPackageServDMO );

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsPackageCode",
      aVpsPackageServDMO.getVpsPackageCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsServiceCode",
      aVpsPackageServDMO.getVpsServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsAlterCharge",
      aVpsPackageServDMO.getVpsAlterCharge(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsMultiCharge",
      aVpsPackageServDMO.getVpsMultiCharge(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsChangeMulti",
      aVpsPackageServDMO.getVpsChangeMulti(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsPriceByTarif",
      aVpsPackageServDMO.getVpsPriceByTarif(  ) ); // attribute

    thrower.ifParameterMissing( "aVpsPackageServDMO.vpsAutoConnect",
      aVpsPackageServDMO.getVpsAutoConnect(  ) ); // attribute

    VpsPackageServDMO updateVpsPackageServDMO = new VpsPackageServDMO(  );

    updateVpsPackageServDMO.setVpsPackageCode( aVpsPackageServDMO
      .getVpsPackageCode(  ) );

    updateVpsPackageServDMO.setVpsServiceCode( aVpsPackageServDMO
      .getVpsServiceCode(  ) );

    updateVpsPackageServDMO = get( updateVpsPackageServDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVpsPackageServDMO.setVpsAlterCharge( aVpsPackageServDMO
      .getVpsAlterCharge(  ) );

    updateVpsPackageServDMO.setVpsMultiCharge( aVpsPackageServDMO
      .getVpsMultiCharge(  ) );

    updateVpsPackageServDMO.setVpsChangeMulti( aVpsPackageServDMO
      .getVpsChangeMulti(  ) );

    updateVpsPackageServDMO.setVpsPriceByTarif( aVpsPackageServDMO
      .getVpsPriceByTarif(  ) );

    updateVpsPackageServDMO.setVpsAutoConnect( aVpsPackageServDMO
      .getVpsAutoConnect(  ) );

    //
    // Modify the vpsPackageServDMO
    //
    vpsPackageServDAC.modify( updateVpsPackageServDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VpsPackageServDMO returnVpsPackageServDMO = new VpsPackageServDMO(  );

    returnVpsPackageServDMO.setVpsPackageCode( updateVpsPackageServDMO
      .getVpsPackageCode(  ) );

    returnVpsPackageServDMO.setVpsServiceCode( updateVpsPackageServDMO
      .getVpsServiceCode(  ) );

    returnVpsPackageServDMO = get( returnVpsPackageServDMO );

    return returnVpsPackageServDMO;
  }

  /**
  * Modifies the VpsPackageServ object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VpsPackageServDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpsPackageServDMO object.
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
    // Modify the vpsPackageServDMO
    //
    vpsPackageServDAC.modify( filter );
  }

  /**
   * Deletes the VpsPackageServ object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VPSPACKAGESERV_003
   *     <li>{@link #Base#VPSPACKAGESERV_000} if the VpsPackageServ does not exist.</li>
   *     <li>{@link #Base#VPSPACKAGESERV_003} if the VpsPackageServ is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VpsPackageServDMO VpsPackageServ object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vpsPackageServDMO )" );

    thrower.ifParameterMissing( "vpsPackageServDMO", vpsPackageServDMO );

    VpsPackageServDMO updateVpsPackageServDMO = null;

    updateVpsPackageServDMO = get( vpsPackageServDMO );

    // delete self...
    vpsPackageServDAC.delete( vpsPackageServDMO );
  }

  /**
   * Deletes the VpsPackageServ object.
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
    vpsPackageServDAC.delete( filter );
  }

  /**
  * Indicates whether a VpsPackageServ exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VpsPackageServ exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vpsPackageServ)" );

    thrower.ifParameterMissing( "vpsPackageServDMO", vpsPackageServDMO );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsPackageCode",
      vpsPackageServDMO.getVpsPackageCode(  ) );

    thrower.ifParameterMissing( "vpsPackageServDMO.vpsServiceCode",
      vpsPackageServDMO.getVpsServiceCode(  ) );

    return vpsPackageServDAC.exists( vpsPackageServDMO );
  }

  /**
   * Indicates whether a VpsPackageServ exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VpsPackageServ exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vpsPackageServDAC.exists( filter );
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

    return vpsPackageServDAC.getList( state, filter );
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

    return vpsPackageServDAC.iterate( filter );
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

    return vpsPackageServDAC.iterateWithLock( filter );
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
  public VpsPackageServDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VpsPackageServDMO
    //
    VpsPackageServDMO vpsPackageServDMO = vpsPackageServDAC.get( filter );

    return vpsPackageServDMO;
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

    return vpsPackageServDAC.max( filter );
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

    return vpsPackageServDAC.min( filter );
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

    return new Integer(vpsPackageServDAC.count( filter ));
  }
}
