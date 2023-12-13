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
 * null
 *
 * This abstract business logic class holds all the logic for the SpdServParamDef class.
 * It is extended by SpdServParamDef class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SpdServParamDefAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SpdServParamDef.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SPDPD";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SpdServParamDefDAC spdServParamDefDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return SpdServParamDefDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.spdServParamDefDAC = (SpdServParamDefDAC) dac;
  }

  /**
  * Retrieve a spdServParamDef data model object from persistent storage. The
  * spdServParamDefDMO passed in must contain a valid existing spdServParamDefId.
  * Optionally, the return spdServParamDefDMO may be include a flag that indicates if
  * the spdServParamDef object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the spdServParamDef object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SPDSERVPARAMDEF_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  spdServParamDefDMO the spdServParamDef object that must contain either the
  *         unique spdServParamDefId or the displayCode/languageCode pair
  *
  * @return spdServParamDefDMO the spdServParamDef data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SpdServParamDefDMO get( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(spdServParamDefDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "spdServParamDefDMO", spdServParamDefDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "spdServParamDefDMO.spdServiceCode",
      spdServParamDefDMO.getSpdServiceCode(  ) );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdParamId",
      spdServParamDefDMO.getSpdParamId(  ) );

    //
    // Attempt to get the SpdServParamDefDMO
    //
    SpdServParamDefDMO returnSpdServParamDefDMO = spdServParamDefDAC.get( spdServParamDefDMO );

    //
    // Could not find the SpdServParamDefDMO
    //
    if ( returnSpdServParamDefDMO == null ) {
      thrower.business( Base_SPDSERVPARAMDEF_000,
        new Object[] {
          spdServParamDefDMO.getSpdServiceCode(  ),
          spdServParamDefDMO.getSpdParamId(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSpdServParamDefDMO;
  }

  /**
   * Return a list of SpdServParamDef objects matching the passed in values. A
   * partial match is performed on the description argument and/or the spdServParamDefs
   * displayCode. If no values have been passed in, all SpdServParamDef objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SpdServParamDef is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param spdServParamDefDMO SpdServParamDefDMO object
   *
   * @return DTOList of SpdServParamDef objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, spdServParamDefDMO )" );

    return spdServParamDefDAC.getList( state, spdServParamDefDMO );
  }

  /**
  * Creates the SpdServParamDef object. As a side effect, following creation
  * of a spdServParamDef an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param spdServParamDefDMO spdServParamDefDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spdServParamDefDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SpdServParamDefDMO create( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( spdServParamDefDMO )" );

    thrower.ifParameterMissing( "spdServParamDefDMO", spdServParamDefDMO );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdServiceCode",
      spdServParamDefDMO.getSpdServiceCode(  ) );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdParamId",
      spdServParamDefDMO.getSpdParamId(  ) );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdDefaultVal",
      spdServParamDefDMO.getSpdDefaultVal(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( spdServParamDefDMO ) ) {
      thrower.business( Base_SPDSERVPARAMDEF_001,
        new Object[] {
          spdServParamDefDMO.getSpdServiceCode(  ),
          spdServParamDefDMO.getSpdParamId(  )
        } );
    }

    //
    // Now create the spdServParamDef
    //
    spdServParamDefDAC.create( spdServParamDefDMO );

    return spdServParamDefDMO;
  }

  /**
  * Modifies the SpdServParamDef object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SPDSERVPARAMDEF_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param spdServParamDefDMO spdServParamDefDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spdServParamDefDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SpdServParamDefDMO modify( SpdServParamDefDMO aSpdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aspdServParamDefDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aspdServParamDefDMO", aSpdServParamDefDMO );

    thrower.ifParameterMissing( "aSpdServParamDefDMO.spdServiceCode",
      aSpdServParamDefDMO.getSpdServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aSpdServParamDefDMO.spdParamId",
      aSpdServParamDefDMO.getSpdParamId(  ) ); // attribute

    thrower.ifParameterMissing( "aSpdServParamDefDMO.spdDefaultVal",
      aSpdServParamDefDMO.getSpdDefaultVal(  ) ); // attribute

    SpdServParamDefDMO updateSpdServParamDefDMO = new SpdServParamDefDMO(  );

    updateSpdServParamDefDMO.setSpdServiceCode( aSpdServParamDefDMO
      .getSpdServiceCode(  ) );

    updateSpdServParamDefDMO.setSpdParamId( aSpdServParamDefDMO.getSpdParamId(  ) );

    updateSpdServParamDefDMO = get( updateSpdServParamDefDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSpdServParamDefDMO.setSpdDefaultVal( aSpdServParamDefDMO
      .getSpdDefaultVal(  ) );

    //
    // Modify the spdServParamDefDMO
    //
    spdServParamDefDAC.modify( updateSpdServParamDefDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SpdServParamDefDMO returnSpdServParamDefDMO = new SpdServParamDefDMO(  );

    returnSpdServParamDefDMO.setSpdServiceCode( updateSpdServParamDefDMO
      .getSpdServiceCode(  ) );

    returnSpdServParamDefDMO.setSpdParamId( updateSpdServParamDefDMO
      .getSpdParamId(  ) );

    returnSpdServParamDefDMO = get( returnSpdServParamDefDMO );

    return returnSpdServParamDefDMO;
  }

  /**
  * Modifies the SpdServParamDef object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SpdServParamDefDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated spdServParamDefDMO object.
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
    // Modify the spdServParamDefDMO
    //
    spdServParamDefDAC.modify( filter );
  }

  /**
   * Deletes the SpdServParamDef object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SPDSERVPARAMDEF_003
   *     <li>{@link #Base#SPDSERVPARAMDEF_000} if the SpdServParamDef does not exist.</li>
   *     <li>{@link #Base#SPDSERVPARAMDEF_003} if the SpdServParamDef is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SpdServParamDefDMO SpdServParamDef object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( spdServParamDefDMO )" );

    thrower.ifParameterMissing( "spdServParamDefDMO", spdServParamDefDMO );

    SpdServParamDefDMO updateSpdServParamDefDMO = null;

    updateSpdServParamDefDMO = get( spdServParamDefDMO );

    // delete self...
    spdServParamDefDAC.delete( spdServParamDefDMO );
  }

  /**
   * Deletes the SpdServParamDef object.
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
    spdServParamDefDAC.delete( filter );
  }

  /**
  * Indicates whether a SpdServParamDef exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the SpdServParamDef exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(spdServParamDef)" );

    thrower.ifParameterMissing( "spdServParamDefDMO", spdServParamDefDMO );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdServiceCode",
      spdServParamDefDMO.getSpdServiceCode(  ) );

    thrower.ifParameterMissing( "spdServParamDefDMO.spdParamId",
      spdServParamDefDMO.getSpdParamId(  ) );

    return spdServParamDefDAC.exists( spdServParamDefDMO );
  }

  /**
   * Indicates whether a SpdServParamDef exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SpdServParamDef exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return spdServParamDefDAC.exists( filter );
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
  public DTOList getList(DTOListState state,
    QueryFilter  filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, filter )" );

    return spdServParamDefDAC.getList( state, filter );
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

    return spdServParamDefDAC.iterate( filter );
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

    return spdServParamDefDAC.iterateWithLock( filter );
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
  public SpdServParamDefDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SpdServParamDefDMO
    //
    SpdServParamDefDMO spdServParamDefDMO = spdServParamDefDAC.get( filter );

    return spdServParamDefDMO;
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

    return spdServParamDefDAC.max( filter );
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

    return spdServParamDefDAC.min( filter );
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

    return new Integer(spdServParamDefDAC.count( filter ));
  }
}
