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

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.QueryFilter;

/**
 * null
 *
 * This abstract business logic class holds all the logic for the NmNetmat class.
 * It is extended by NmNetmat class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class NmNetmatAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( NmNetmat.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "NMN";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected NmNetmatDAC nmNetmatDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.nmNetmatDAC = (NmNetmatDAC) dac;
  }

  /**
  * Retrieve a nmNetmat data model object from persistent storage. The
  * nmNetmatDMO passed in must contain a valid existing nmNetmatId.
  * Optionally, the return nmNetmatDMO may be include a flag that indicates if
  * the nmNetmat object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the nmNetmat object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NMNETMAT_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  nmNetmatDMO the nmNetmat object that must contain either the
  *         unique nmNetmatId or the displayCode/languageCode pair
  *
  * @return nmNetmatDMO the nmNetmat data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public NmNetmatDMO get( NmNetmatDMO nmNetmatDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(nmNetmatDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "nmNetmatDMO", nmNetmatDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "nmNetmatDMO.nmInternalTariff",
      nmNetmatDMO.getNmInternalTariff(  ) );

    //
    // Attempt to get the NmNetmatDMO
    //
    NmNetmatDMO returnNmNetmatDMO = nmNetmatDAC.get( nmNetmatDMO );

    //
    // Could not find the NmNetmatDMO
    //
    if ( returnNmNetmatDMO == null ) {
      thrower.business( Base_NMNETMAT_000,
        new Object[] { nmNetmatDMO.getNmInternalTariff(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnNmNetmatDMO;
  }

  /**
   * Return a list of NmNetmat objects matching the passed in values. A
   * partial match is performed on the description argument and/or the nmNetmats
   * displayCode. If no values have been passed in, all NmNetmat objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the NmNetmat is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param nmNetmatDMO NmNetmatDMO object
   *
   * @return DTOList of NmNetmat objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<NmNetmatDMO> getList( 
//    DTOListState state,
//    NmNetmatDMO  nmNetmatDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, nmNetmatDMO )" );
//
//    return nmNetmatDAC.getList( state, nmNetmatDMO );
//  }

  /**
  * Creates the NmNetmat object. As a side effect, following creation
  * of a nmNetmat an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param nmNetmatDMO nmNetmatDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated nmNetmatDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public NmNetmatDMO create( NmNetmatDMO nmNetmatDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( nmNetmatDMO )" );

    thrower.ifParameterMissing( "nmNetmatDMO", nmNetmatDMO );

    thrower.ifParameterMissing( "nmNetmatDMO.nmInternalTariff",
      nmNetmatDMO.getNmInternalTariff(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmNetworkTariff",
      nmNetmatDMO.getNmNetworkTariff(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmContractPeriod",
      nmNetmatDMO.getNmContractPeriod(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmHigherMigType",
      nmNetmatDMO.getNmHigherMigType(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmLowerMigType",
      nmNetmatDMO.getNmLowerMigType(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmSameMigType",
      nmNetmatDMO.getNmSameMigType(  ) );

    thrower.ifParameterMissing( "nmNetmatDMO.nmNetworkId",
      nmNetmatDMO.getNmNetworkId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( nmNetmatDMO ) ) {
      thrower.business( Base_NMNETMAT_001,
        new Object[] { nmNetmatDMO.getNmInternalTariff(  ) } );
    }

    //
    // Now create the nmNetmat
    //
    nmNetmatDAC.create( nmNetmatDMO );

    return nmNetmatDMO;
  }

  /**
  * Modifies the NmNetmat object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NMNETMAT_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param nmNetmatDMO nmNetmatDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated nmNetmatDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public NmNetmatDMO modify( NmNetmatDMO aNmNetmatDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( anmNetmatDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "anmNetmatDMO", aNmNetmatDMO );

    thrower.ifParameterMissing( "aNmNetmatDMO.nmInternalTariff",
      aNmNetmatDMO.getNmInternalTariff(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmNetworkTariff",
      aNmNetmatDMO.getNmNetworkTariff(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmContractPeriod",
      aNmNetmatDMO.getNmContractPeriod(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmHigherMigType",
      aNmNetmatDMO.getNmHigherMigType(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmLowerMigType",
      aNmNetmatDMO.getNmLowerMigType(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmSameMigType",
      aNmNetmatDMO.getNmSameMigType(  ) ); // attribute

    thrower.ifParameterMissing( "aNmNetmatDMO.nmNetworkId",
      aNmNetmatDMO.getNmNetworkId(  ) ); // attribute

    NmNetmatDMO updateNmNetmatDMO = new NmNetmatDMO(  );

    updateNmNetmatDMO.setNmInternalTariff( aNmNetmatDMO.getNmInternalTariff(  ) );

    updateNmNetmatDMO = get( updateNmNetmatDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateNmNetmatDMO.setNmNetworkTariff( aNmNetmatDMO.getNmNetworkTariff(  ) );

    updateNmNetmatDMO.setNmContractPeriod( aNmNetmatDMO.getNmContractPeriod(  ) );

    updateNmNetmatDMO.setNmMinCancPeriod( aNmNetmatDMO.getNmMinCancPeriod(  ) );

    updateNmNetmatDMO.setNmHigherMigType( aNmNetmatDMO.getNmHigherMigType(  ) );

    updateNmNetmatDMO.setNmLowerMigType( aNmNetmatDMO.getNmLowerMigType(  ) );

    updateNmNetmatDMO.setNmSameMigType( aNmNetmatDMO.getNmSameMigType(  ) );

    updateNmNetmatDMO.setNmNetworkId( aNmNetmatDMO.getNmNetworkId(  ) );

    updateNmNetmatDMO.setNmNetType( aNmNetmatDMO.getNmNetType(  ) );

    //
    // Modify the nmNetmatDMO
    //
    nmNetmatDAC.modify( updateNmNetmatDMO );

    // Create a new DMO, set keys, and fetch from the database...
    NmNetmatDMO returnNmNetmatDMO = new NmNetmatDMO(  );

    returnNmNetmatDMO.setNmInternalTariff( updateNmNetmatDMO
      .getNmInternalTariff(  ) );

    returnNmNetmatDMO = get( returnNmNetmatDMO );

    return returnNmNetmatDMO;
  }

  /**
  * Modifies the NmNetmat object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param NmNetmatDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated nmNetmatDMO object.
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
    // Modify the nmNetmatDMO
    //
    nmNetmatDAC.modify( filter );
  }

  /**
   * Deletes the NmNetmat object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_NMNETMAT_003
   *     <li>{@link #Base#NMNETMAT_000} if the NmNetmat does not exist.</li>
   *     <li>{@link #Base#NMNETMAT_003} if the NmNetmat is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param NmNetmatDMO NmNetmat object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( NmNetmatDMO nmNetmatDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( nmNetmatDMO )" );

    thrower.ifParameterMissing( "nmNetmatDMO", nmNetmatDMO );

    NmNetmatDMO updateNmNetmatDMO = null;

    updateNmNetmatDMO = get( nmNetmatDMO );

    // delete self...
    nmNetmatDAC.delete( nmNetmatDMO );
  }

  /**
   * Deletes the NmNetmat object.
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
    nmNetmatDAC.delete( filter );
  }

  /**
  * Indicates whether a NmNetmat exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the NmNetmat exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( NmNetmatDMO nmNetmatDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(nmNetmat)" );

    thrower.ifParameterMissing( "nmNetmatDMO", nmNetmatDMO );

    thrower.ifParameterMissing( "nmNetmatDMO.nmInternalTariff",
      nmNetmatDMO.getNmInternalTariff(  ) );

    return nmNetmatDAC.exists( nmNetmatDMO );
  }

  /**
   * Indicates whether a NmNetmat exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the NmNetmat exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return nmNetmatDAC.exists( filter );
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
//  public DTOList<NmNetmatDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return nmNetmatDAC.getList( state, filter );
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

    return nmNetmatDAC.iterate( filter );
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

    return nmNetmatDAC.iterateWithLock( filter );
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
  public NmNetmatDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the NmNetmatDMO
    //
    NmNetmatDMO nmNetmatDMO = nmNetmatDAC.get( filter );

    return nmNetmatDMO;
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

    return nmNetmatDAC.max( filter );
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

    return nmNetmatDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(nmNetmatDAC.count( filter )));
  }
}
